package animal;

    public abstract class Animal implements Playable {

        protected String type;

        public String getType() {
            return type;
        }

        public String getName(){
            return name;
        }

        protected String name;
        protected Integer noOfLegs;

        public Animal(String animal,String owner,Integer noOfLegs,String type){
            this.type = type;
            this.name = animal;
            this.noOfLegs = noOfLegs;
                    }

          public void eat()
          {
                System.out.println("Am an omnivore");
          }
          public void speak()
          {
              System.out.println("I create a lot of fuss over me");
          }
          public void function(){
            System.out.println("I can love you and guard your home but am a player");
          }
          public void pet()
          {
              System.out.println("Am a pet animal");
          }

        @Override
        public void play(){
            System.out.println("PLAYING : I am " + name + ". A " + noOfLegs + " legged " + type + " Throw a ball, I can go-fetch!");
            pet();
            eat();
            speak();
            function();
        }


    }
