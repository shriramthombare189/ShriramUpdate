mport java.io.File;
class Slip8B {
    public static void main(String[] args) {
        File file = new File(" Your File Path ");
        String[] fileList = file.list();
        for(String str : fileList) {
            if(str.endsWith(".txt")){
                System.out.println(str);
            }
        }
    }
}