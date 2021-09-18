package com.elvislee.producerconsumer;

import java.util.List;

public class Producer implements Runnable{
    List<Integer> questionList = null;
    final int LIMIT = 5;
    private int questionNo;

    public Producer(List<Integer> quesionList) {
        this.questionList = quesionList;
    }

    public void readQuestions(int questionNo) throws InterruptedException {
        synchronized (questionList) {
            while(questionList.size() == LIMIT) {
                System.out.println("Questions have piled up... wait for answers");
                questionList.wait();
            }
        }

        synchronized (questionList) {
            System.out.println("New Question: " + questionNo);
            questionList.add(questionNo);
            Thread.sleep(100);
            questionList.notify();
        }
    }

    @Override
    public void run() {
        while(true) {
            try {
                readQuestions(questionNo++);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
