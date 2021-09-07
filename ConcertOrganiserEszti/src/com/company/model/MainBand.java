package com.company.model;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Optional;

public class MainBand {
    private final String name;
    private Style style;

    public MainBand(String name, Style style) {
        this.name = name;
        this.style = style;
    }

    public WarmupBand resp() {
        System.out.println("No warmup band available");
        return null;
    }

    public WarmupBand chooseWarmupBand(HashSet<WarmupBand> warmupBands) {
        return warmupBands.stream()
                .filter(warmupBand -> warmupBand.getStyle().equals(style))
                .findFirst()
                .orElseThrow(NoSuchElementException::new); //handle throw with message
        //        for (WarmupBand warmupBand : warmupBands) {
//            if (warmupBand.getStyle().equals(style)){
//                return warmupBand;
//            }
//        }
//        System.out.println("No warmup band available");
//        return null;
    }
}
