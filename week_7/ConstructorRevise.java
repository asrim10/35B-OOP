// public class ConstructorRevise {
//     public static void main(String[] args) {
//         NonparameterizedConstructor np=new NonparameterizedConstructor();
//         System.out.println(np.data2);

//         ParameterizedConstructor pc= new ParameterizedConstructor(10,"Ram2");
//         System.out.println(pc.data2);
//         pc.data2="changing";
//         System.out.println(pc.data2);
//         // pc.data1=100; //
//         pc.setData1(100);
//         //System.err.println(pc.data1);
//         System.out.println(pc.getData1());

//     }
// }
// class ParameterizedConstructor{
//     private int data1; //this .data1
//     String data2;
//     // write only access to private property
//     void setData1(int data1){
//         this.data1=data1;
//     }
//     //read only access to private property
//     int getData1(){
//         return this.data1;
//     }

//     ParameterizedConstructor(int data1, String data2){
//         this.data1=data1;
//         this.data2=data2;
//     }
// }


// class NonparameterizedConstructor{
//     private int data1;
//     String data2;
//     NonparameterizedConstructor(){
//         data1=10;
//         data2="Ram";
//         System.out.println("Running in object creation");
//     }
// }





/*task
 * make a class song
 * make 3 private title, duration and artist
 * make 2 public property album and desceription
 * make constructor to set title and duration only
 * make setter for duration and artist
 * make getter for title, duration and artist
 * make 2 object of song
 * fill all the attribute
 * change the duration of 1st object
 * change the artist of 2nd object
 * print the following fot the both object
 * output 
 * song1
 * title: ABC
 * duration:10
 * Artsist XYZ
 * Album:XX
 * Description:Lorem Ipsum
 * song2
 * ..
 */

public class ConstructorRevise {

    public static void main(String[] args) {
        Song s1=new Song("ABC",4);
        s1.setId(1);
        s1.setArtist("Dj khaled");
        s1.description="Lorem Ipsum";
        s1.albumb="Dollar";
        s1.setDuration(5);
        System.out.println("Song"+ s1.getId());
        System.out.println("Title"+ s1.getTitle());
        System.out.println("Duration"+ s1.getDuration());
        System.out.println("Artists"+ s1.getArtists());
        System.out.println("Album"+ s1.albumb);
        System.out.println("Description"+ s1.description);
    }
}

class Song{
    private int id;
    private String title;
    private int duration;
    private String artists;

    public String albumb;
    public String description;

    Song(String title, int duration){
        this.title=title;
        this.duration=duration;
    }
    void setId(int id){
        this.id=id;
    }
    void setDuration(int duration){
        this.duration=duration;
    }
    void setArtist(String artists){
        this.artists=artists;
    }
    
    int getId(){
        return this.id;
    }
    String getTitle(){
        return this.title;
    }
    int getDuration(){
        return this.duration;
    }
    String getArtists(){
        return this.artists;
    }
    

}