
package org.mbds.hadoop.wordcount;

import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.IntWritable;
import java.util.StringTokenizer;
import org.apache.hadoop.mapreduce.Mapper;
import java.io.IOException;


	public class WCountMap extends Mapper<Object, Text, Text, IntWritable>
	{
		private static final IntWritable ONE=new IntWritable(1);

		protected void map(Object key, Text value, Context context) throws IOException, InterruptedException
		{
			StringTokenizer tok=new StringTokenizer(value.toString(), " ");
			while(tok.hasMoreTokens())
			{
				Text word=new Text(tok.nextToken());
				context.write(word, ONE);
			}
		}
	}