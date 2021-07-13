public class StringManipulator {
    public String trimAndConcat(String str1, String str2){
        String str3 = str1.trim() + str2.trim();
        return str3;
    }



    public Integer getIndexOrNull(String str, char chr){
        Integer result = str.indexOf(chr);
        if (result<0){
            result = null;
        }
        return result;
    }

    public Integer getIndexOrNull(String str1, String str2){
        Integer result = str1.indexOf(str2);
        if (result<0){
            result = null;
        }
        return result;
    }

    public String concatSubstring(String substring, int startIndex, int endIndex, String concatMe){
        substring = substring.substring(startIndex, endIndex);
        String concaString= substring + concatMe;
        return concaString;
    }



}