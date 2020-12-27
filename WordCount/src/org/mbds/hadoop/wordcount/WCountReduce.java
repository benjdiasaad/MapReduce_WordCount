/*
  M2 MBDS - Big Data/Hadoop
	Année 2013/2014
  --
  TP1: exemple de programme Hadoop - compteur d'occurences de mots.
  --
  WCountReduce.java: classe REDUCE.
*/
package org.mbds.hadoop.wordcount;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.mapreduce.Reducer;
import java.util.Iterator;
import java.io.IOException;

public class WCountReduce extends Reducer<Text, IntWritable, Text, Text>
{
  public void reduce(Text key, Iterable<IntWritable> values, Context context) throws IOException, InterruptedException
	
}