package myPack;

import java.util.Map;

import backtype.storm.task.OutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseRichBolt;
import backtype.storm.tuple.Fields;
import backtype.storm.tuple.Tuple;

public class HelloWorldBolt extends BaseRichBolt{

	@Override
	public void prepare(Map stormConf, TopologyContext context,OutputCollector collector) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void execute(Tuple input) {
		
		String test = input.getStringByField("sentence");
		if("Hello World".equals(test)){
		int myCount = 0;
		myCount++;
		System.out.println("Found a Hello World! My Count is now: "
		+ Integer.toString(myCount));
		}
		
	}

	@Override
	public void declareOutputFields(OutputFieldsDeclarer declarer) {
		
		declarer.declare(new Fields("sentence"));
	}
	
	
	

}
