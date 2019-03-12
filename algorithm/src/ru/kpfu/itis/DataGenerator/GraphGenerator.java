package ru.kpfu.itis.DataGenerator;

import ru.kpfu.itis.Graph.Peak;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class GraphGenerator implements Generator<String>{
    @Override
    public String generate(){
        int range = new Random().nextInt(901) + 100;
        return generate(range);
    }

    @Override
    public String generate(int range){
        HashSet<Peak> set = new HashSet<>();
        for(int i = 0; i < range; ){
            Peak temp = new Peak(new Random().nextInt(1001), new Random().nextInt(1001));
            if(set.add(temp))
                i++;
        }
        StringBuilder sb = new StringBuilder();
        for(Peak p: set){
            sb.append(p.toString() + ";");
        }
        return range + " " + sb.toString();
    }
}