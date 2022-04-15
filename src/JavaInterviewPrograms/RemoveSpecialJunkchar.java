package JavaInterviewPrograms;

public class RemoveSpecialJunkchar {
    public static void main(String[] args) {
        /*String str="This#string%contains^special*characters&.";
        str=str.replaceAll("[^a-zA-Z0-10]"," ");
        System.out.println("After replacing special/junk characters : "  + str);*/

        String s="The rains have started here selenium sikuli";
        //String s1="The rains have started here selenium sikuli";
        String s1=new String("The rains have started here selenium sikuli");
        System.out.println(s.indexOf('s',s.indexOf('s')+1));
        System.out.println(s.lastIndexOf('s'));
        //System.out.println();
        System.out.println(s.equals(s1));
        System.out.println(s==s1);
    }
}
