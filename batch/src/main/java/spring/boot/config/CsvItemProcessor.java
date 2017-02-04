package spring.boot.config;

import org.springframework.batch.item.validator.ValidatingItemProcessor;

import spring.boot.model.Person;

public class CsvItemProcessor extends ValidatingItemProcessor<Person> {
	@Override
	public Person process(Person item){
		if("汉族".equals(item.getNation())){
			item.setNation("01");
		}else{
			item.setNation("02");
		}
		return item;
	}
}
