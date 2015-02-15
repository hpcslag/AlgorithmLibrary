package Search;

public class ArraySearch {
    /**
        * alive 
        * check some target is alive
        * 
        * @param {Primary Type Array}array
        * @param {Primary Type} Argument
        */
    public boolean alive(String arr[],String argument){
        for(String target:arr)
            if(argument.equals(target)) return true;
        return false;
    }
    public boolean alive(int arr[],int argument){
        for(int target:arr)
            if(argument == target) return true;
        return false;
    }
    public boolean alive(float arr[],float argument){
        for(float target : arr)
            if(argument == target) return true;
        return false;
    }
    public boolean alive(double arr[],double argument){
        for(double target : arr)
            if(argument == target) return true;
        return false;
    }
    public boolean alive(char arr[],char argument){
        for(char target : arr)
            if(argument == target) return true;
        return false;
    }
}
