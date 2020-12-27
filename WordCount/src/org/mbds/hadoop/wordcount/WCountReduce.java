
package org.mbds.hadoop.wordcount;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.mapreduce.Reducer;
import java.util.Iterator;
import java.io.IOException;

public class WCountReduce extends Reducer<Text, IntWritable, Text, Text>
{
  public void reduce(Text key, Iterable<IntWritable> values, Context context) throws IOException, InterruptedException
	{
		
		Iterator<IntWritable> i=values.iterator();
		int count=0;
		while(i.hasNext())   
			count+=i.next().get();   
		context.write(key, new Text(count+" occurences."));
  }
}