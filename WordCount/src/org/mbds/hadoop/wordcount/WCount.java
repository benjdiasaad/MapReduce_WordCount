package org.mbds.hadoop.wordcount;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.util.GenericOptionsParser;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.IntWritable;


public class WCount
{
	
	public static void main(String[] args) throws Exception
	{
		
				Configuration conf=new Configuration();
				String[] ourArgs=new GenericOptionsParser(conf, args).getRemainingArgs();
		
				Job job=Job.getInstance(conf, "Compteur de mots v1.0");
				
				job.setJarByClass(WCount.class);
				job.setMapperClass(WCountMap.class);
				job.setReducerClass(WCountReduce.class);

		
	}
}
