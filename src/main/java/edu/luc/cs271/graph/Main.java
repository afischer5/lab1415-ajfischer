package edu.luc.cs271.graph;

import java.util.*;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;
import org.jgrapht.traverse.*;
import org.jgrapht.*;
import org.jgrapht.alg.color.GreedyColoring;

public class Main {
public static void main(String[] args){
  
  final Graph<String, DefaultEdge> myMap = new SimpleGraph<>(DefaultEdge.class);
  
    myMap.addVertex(codes.FR);
    myMap.addVertex(codes.AD);
    myMap.addVertex(codes.ES);
    myMap.addVertex(codes.BE);
    myMap.addVertex(codes.LU);
    myMap.addVertex(codes.CH);
    myMap.addVertex(codes.IT);
  
    myMap.addEdge(codes.FR,codes.AD);
    myMap.addEdge(codes.FR,codes.ES);
    myMap.addEdge(codes.FR,codes.BE);
    myMap.addEdge(codes.FR,codes.LU);
    myMap.addEdge(codes.FR,codes.CH);
    myMap.addEdge(codes.FR,codes.IT);
    
    final Iterator<String> bfFR = new BreadthFirstIterator<>(myMap, codes.FR);
    while(bfFR.hasNext()) {
      final String current = bfFR.next();
      System.out.println(current);
    }
    
    System.out.println("");
    
     final Iterator<String> bfES = new BreadthFirstIterator<>(myMap, codes.ES);
    while(bfES.hasNext()) {
      final String current = bfES.next();
      System.out.println(current);
    }
    
     System.out.println("");
    
     final Iterator<String> csES = new ClosestFirstIterator<>(myMap, codes.ES);
    while(csES.hasNext()) {
      final String current = csES.next();
      System.out.println(current);
    }
    
     System.out.println("");
    
     final Iterator<String> csFR = new ClosestFirstIterator<>(myMap, codes.FR);
    while(csFR.hasNext()) {
      final String current = csFR.next();
      System.out.println(current);
    }
    
     System.out.println("");
    
     final Iterator<String> dfES = new DepthFirstIterator<>(myMap, codes.ES);
    while(dfES.hasNext()) {
      final String current = dfES.next();
      System.out.println(current);
    }
    
     System.out.println("");
    
     final Iterator<String> dfFR = new DepthFirstIterator<>(myMap, codes.FR);
    while(dfFR.hasNext()) {
      final String current = dfFR.next();
      System.out.println(current);
    }
    
     System.out.println("");
    
     final Iterator<String> rES = new RandomWalkIterator<>(myMap, codes.ES);
    for(int i = 0; i < 25; i++){
      final String current = rES.next();
      System.out.println(current);
    }
    
     System.out.println("");
    
     final Iterator<String> rFR = new RandomWalkIterator<>(myMap, codes.FR);
    for(int i = 0; i < 25; i++){
      final String current = rFR.next();
      System.out.println(current);
    }
    
    GreedyColoring<String, DefaultEdge> coloring = new GreedyColoring(myMap);
    System.out.println(coloring.getColoring());
}
}