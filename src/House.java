public class House {
    //this is data declaration while creating class
    String name;
    int bedrooms;
    int toilets;


    //parametrized constructor
    House(String name, int bedrooms, int toilets) {
        this.name = name;
        this.bedrooms = bedrooms;
        this.toilets = toilets;

    }
    void findingArea(){
        System.out.println("This is the finding area functions.");
    }

    void cookingFood(){
        System.out.println("This is the cooking food functions");
    }
    void cleaningBathroom(){
        System.out.println("This is the cleaning bathroom functions");
    }
    void changingBedsheet(){
        System.out.println("This is the changing bedsheet functions.");
    }
    void HooveringHouse(){
        System.out.println("This is the hoovering house functions");
    }


    //no parameter constructor
    House() {

    }

    House(String name) {
        this.name = name;
    }

    House(String name, int bedrooms) {
        this.name = name;
        this.bedrooms = bedrooms;
    }

    House(int bedrooms, String name) {
        this.bedrooms = bedrooms;
        this.name = name;
    }

    House(int toilets, int bedrooms, String name) {
        this.toilets = toilets;
        this.bedrooms = bedrooms;
        this.name = name;

    }

    House(int bedrooms, int toilets) {
        this.bedrooms = bedrooms;
        this.toilets = toilets;
    }
    //copy constructor
    //h1 is the data type of House that's why it expect the data type house as we have created h1 in main folder
    House(House h1){
      this.name=h1.name;
      this.toilets=h1.toilets;
      this.bedrooms=h1.bedrooms;
    }

}

