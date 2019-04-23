package com.slsd.www;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
public class JacksonDemo {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
		ObjectMapper objectMapper=new ObjectMapper();
		//美化输出
		objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
		//模拟数据
		User user=new User("zs","123","tom");
		//转换成json
		String writeValueAsString=objectMapper.writeValueAsString(user);
		System.out.println(writeValueAsString);
		//列表转化
		List<User> list=new ArrayList<User>();
		list.add(user);
		list.add(user);
		String listJson=objectMapper.writeValueAsString(list);
		System.out.println(listJson);
		//反序列化
		User  userR=objectMapper.readValue(writeValueAsString, User.class);
		System.out.println(userR);
		//列表反序列化
		List<User> listR=objectMapper.readValue(listJson,new  TypeReference<List<User>>() {

		});
		listR.forEach(System.out::println);
		//列表反序列化的第二种方式
		JavaType javaType=objectMapper.getTypeFactory().constructCollectionLikeType(List.class, User.class);
		List<User> list2=objectMapper.readValue(listJson, javaType);
		list2.forEach(System.out::println);
		//允许序列空的POJO类
		//(否则会抛出异常）
		objectMapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
		//吧Java。util.Date,Calender输出为数字（时间戳）
		objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		//在遇到未知的属性的时候抛出异常
		objectMapper.disable(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES);
		//强制JSON 空字符串（“”）转换为null对象值
		objectMapper.disable(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT);
		//在JSON中允许C/C++ 样式的注释（非标准，默认禁用）
		objectMapper.configure(JsonParser.Feature.ALLOW_COMMENTS, true);
		//允许没有引号的字段名（非标准）
		objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
		//允许单引号（非标准）
		objectMapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
		//强转义非ASCII字符
		objectMapper.configure(JsonGenerator.Feature.ESCAPE_NON_ASCII, true);
		//将内容包裹为一个JSON属性，属性名由@JsonRootName注解指定
		objectMapper.configure(SerializationFeature.WRAP_ROOT_VALUE, true);
		
	}

}
