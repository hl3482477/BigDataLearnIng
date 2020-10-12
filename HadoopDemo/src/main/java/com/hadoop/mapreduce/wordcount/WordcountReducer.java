package com.hadoop.mapreduce.wordcount;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.mapreduce.Reducer;

import javax.xml.soap.Text;
import java.io.IOException;

/**
 * @author HULU
 * @version 创建时间：2020/10/12 11:27
 */
public class WordcountReducer extends Reducer<Text, IntWritable, Text, IntWritable> {

    int sum;
    IntWritable v = new IntWritable();

    @Override
    protected void reduce(Text key, Iterable<IntWritable> values, Context context) throws IOException, InterruptedException {

        for (IntWritable count : values) {
            sum+=count.get();
        }
        v.set(sum);
        context.write(key,v);
    }
}
