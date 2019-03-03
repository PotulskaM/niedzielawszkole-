package pl.saltsoft;

public class ManyWorkers {

        public void startManyWorkers(int howMany) {
            for (int i = 0; i < howMany; i++) {
                Thread object = new Thread(new WorkersJava());
                object.start();
            }
        }

}
