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
		//�������
		objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
		//ģ������
		User user=new User("zs","123","tom");
		//ת����json
		String writeValueAsString=objectMapper.writeValueAsString(user);
		System.out.println(writeValueAsString);
		//�б�ת��
		List<User> list=new ArrayList<User>();
		list.add(user);
		list.add(user);
		String listJson=objectMapper.writeValueAsString(list);
		System.out.println(listJson);
		//�����л�
		User  userR=objectMapper.readValue(writeValueAsString, User.class);
		System.out.println(userR);
		//�б����л�
		List<User> listR=objectMapper.readValue(listJson,new  TypeReference<List<User>>() {

		});
		listR.forEach(System.out::println);
		//�б����л��ĵڶ��ַ�ʽ
		JavaType javaType=objectMapper.getTypeFactory().constructCollectionLikeType(List.class, User.class);
		List<User> list2=objectMapper.readValue(listJson, javaType);
		list2.forEach(System.out::println);
		//�������пյ�POJO��
		//(������׳��쳣��
		objectMapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
		//��Java��util.Date,Calender���Ϊ���֣�ʱ�����
		objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		//������δ֪�����Ե�ʱ���׳��쳣
		objectMapper.disable(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES);
		//ǿ��JSON ���ַ�����������ת��Ϊnull����ֵ
		objectMapper.disable(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT);
		//��JSON������C/C++ ��ʽ��ע�ͣ��Ǳ�׼��Ĭ�Ͻ��ã�
		objectMapper.configure(JsonParser.Feature.ALLOW_COMMENTS, true);
		//����û�����ŵ��ֶ������Ǳ�׼��
		objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
		//�������ţ��Ǳ�׼��
		objectMapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
		//ǿת���ASCII�ַ�
		objectMapper.configure(JsonGenerator.Feature.ESCAPE_NON_ASCII, true);
		//�����ݰ���Ϊһ��JSON���ԣ���������@JsonRootNameע��ָ��
		objectMapper.configure(SerializationFeature.WRAP_ROOT_VALUE, true);
		
	}

}
