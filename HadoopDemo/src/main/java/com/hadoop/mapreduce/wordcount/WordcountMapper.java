package com.hadoop.mapreduce.wordcount;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

/**
 * @author HULU
 * @version 创建时间：2020/10/12 11:15
 */
public class WordcountMapper extends Mapper<LongWritable, Text, Text, IntWritable> {
    Text k = new Text();
    IntWritable v = new IntWritable();

    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        //获取第一行
        String line = value.toString();
        // 2 切割
        String[] split = line.split(" ");
        for (String s : split) {
            k.set(s);
            context.write(k,v);
        }

    }
}
