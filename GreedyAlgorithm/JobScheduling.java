package GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Collections;

public class JobScheduling {
    static class Job {
        char id;
        int deadline, profit;

        public Job(char id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    void printJobSequence(ArrayList<Job> arr, int maxDeadline) {
        int n = arr.size();
        Collections.sort(arr, (a, b) -> b.profit - a.profit);

        boolean[] result = new boolean[maxDeadline];
        char[] job = new char[maxDeadline];

        for (int i = 0; i < n; i++) {
            for (int j = Math.min(maxDeadline - 1, arr.get(i).deadline - 1); j >= 0; j--) {
                if (!result[j]) {
                    result[j] = true;
                    job[j] = arr.get(i).id;
                    break;
                }
            }
        }

        System.out.print("Job Sequence order to get the maximum profit is: ");
        for (char jobId : job) {
            System.out.print(jobId + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Job> arr = new ArrayList<>();
        arr.add(new Job('1', 5, 55));
        arr.add(new Job('2', 2, 65));
        arr.add(new Job('3', 7, 75));
        arr.add(new Job('4', 3, 60));
        arr.add(new Job('5', 2, 70));
        arr.add(new Job('6', 1, 50));
        arr.add(new Job('7', 4, 85));
        arr.add(new Job('8', 5, 68));
        arr.add(new Job('9', 3, 45));

        JobScheduling jobScheduler = new JobScheduling();
        jobScheduler.printJobSequence(arr, 7);
    }
}
