class create {
    void createvideo(){
        System.out.println("Video Created");
    }
}
    
    class gamer extends create{
        void playgame(){
            System.out.println("Game Playing");

        }
    }
    class streaming extends gamer{
        void stream(){
            System.out.println("Live streaming");
        }
    }
    public class multilavel_inheritance {
        public static void main(String[] args) {
            streaming c = new streaming();
            c.createvideo();
            c.playgame();
            c.stream();
        }
    }

