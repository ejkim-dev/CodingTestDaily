public class Test210311 {
    public int strStr(String haystack, String needle){
        int result = 0;
        if (!needle.equals("")){
            if (haystack.contains(needle)){
                String[] haystacks = haystack.split("");
                String[] needles = needle.split("");

                for (int i = 0; i < haystacks.length; i++) {
                    for (int j = 0; j < needle.length(); j++) {
                        if (!haystacks[i+j].equals(needles[j])){
                            System.out.println("아님 i = "+i+" j = "+j);
                            break;
                        } else {
                            System.out.println("들어옴 i = "+i+" j = "+j);
                            System.out.println("ㄴ i = "+haystacks[i+j]+" j = "+needles[j]);
                            if (j == needle.length()-1 &&haystacks[i+j].equals(needles[j])){
                                System.out.println("정답 i = "+i+" j = "+j);
                            return i;
                            }
                        }
                    }
                }
            }else {
                result = -1;
            }
        }
        return result;
    }
}
