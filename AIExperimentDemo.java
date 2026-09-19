class AIExperimentDemo {

    void modifyExperiment(AIExperiment exp) {
        exp.completedEpochs = exp.completedEpochs + 5;
    }

    public static void main(String[] args) {

        AIExperimentDemo demo = new AIExperimentDemo();

        AIExperiment e1 = new AIExperiment();
        AIExperiment e2 = new AIExperiment();

        e1.experimentName = "Image Recognition";
        e1.completedEpochs = 10;
        e1.targetEpochs = 50;

        e2.experimentName = "Chatbot Training";
        e2.completedEpochs = 20;
        e2.targetEpochs = 60;

        // Initial status
        System.out.println("Initial Status:");
        System.out.println(e1.status());
        System.out.println(e2.status());

        // Method calls
        e1.runEpochs(5);
        e2.runEpochs(10, 5);

        System.out.println("After Running Epochs:");
        System.out.println(e1.status());
        System.out.println(e2.status());

        // Remaining epochs
        System.out.println("Remaining Epochs:");
        System.out.println(e1.remainingEpochs());
        System.out.println(e2.remainingEpochs());

        // Pass-by-value experiment
        demo.modifyExperiment(e1);

        System.out.println("After Helper Method:");
        System.out.println(e1.status());
        System.out.println(e2.status());
    }
}