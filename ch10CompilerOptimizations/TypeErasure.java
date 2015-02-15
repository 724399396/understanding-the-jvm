package ch10CompilerOptimizations;

import java.util.HashMap;
import java.util.Map;

public class TypeErasure {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("hello", "你好");
        map.put("hor are you", "吃了没? ");
        System.out.println(map.get("hello"));
        System.out.println(map.get("how are you"));
    }
}
