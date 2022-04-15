package JavaInterviewPrograms;

public class CountOccurrenceOfString {

    public static void main(String[] args) {
      String s="breadjambreadjambreadjamwheat";
      String searchfind="bread";
      int count=0;
      int fromindex=0;
      while((fromindex=s.indexOf(searchfind,fromindex)) != -1){
          count++;
          fromindex++;
      }
        System.out.println("total occurrence of " + searchfind + count + "times in a string");

    }
}
