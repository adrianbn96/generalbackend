package com.heinsohn.obl.gestion.pruebajprofiler.services;

import javax.enterprise.context.ApplicationScoped;
import java.util.Random;


@ApplicationScoped
public class ThreadsService {

    public void startThreads() {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int workTime = 5000 + random.nextInt(5000); // Tiempo de trabajo entre 5 y 10 segundos
            new Thread(new WorkingTask(workTime), "Thread-" + i).start();
        }
    }

    private class WorkingTask implements Runnable {
        private final int workTime;

        public WorkingTask(int workTime) {
            this.workTime = workTime;
        }

        @Override
        public void run() {
            long startTime = System.currentTimeMillis();
            long endTime = startTime + workTime;

            System.out.println(Thread.currentThread().getName() + " will work for " + workTime + " ms");

            // Mantener el hilo en RUNNABLE realizando cálculos
            while (System.currentTimeMillis() < endTime) {
                double value = Math.sqrt(Math.random()) * Math.tan(Math.random()); // Trabajo intensivo de cálculo
            }

            System.out.println(Thread.currentThread().getName() + " has finished working");
        }
    }
}


