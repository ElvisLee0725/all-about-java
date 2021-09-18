package com.elvislee.producerconsumer;

import java.util.List;

public class Consumer implements Runnable{
    List<Integer> questionList = null;

    public Consumer(List<Integer> quesionList) {
        this.questionList = quesionList;
    }

    public void answerQuestions() throws InterruptedException {
        synchronized (questionList) {
            while(questionList.isEmpty()) {
                System.out.println("No questions to answer... Waiting for producer to produce questions");
                questionList.wait();
            }
        }

        synchronized (questionList) {
            Thread.sleep(5000);
            System.out.println("Answered question " + questionList.remove(0));
            questionList.notify();
        }
    }

    @Override
    public void run() {
        while(true) {
            try {
                answerQuestions();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
