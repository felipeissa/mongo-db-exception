# This is a sample of PropertyReferenceException throwing on mongo db usage



Configure a mongodb database  in your application.properties file by setting the property 'spring.data.mongodb.uri'


After that startup the application and add an exception breakpoint on PropertyReferenceException

It will be throw many times for each database interaction the application does, as follows:

```No property 'STATUS' found for type 'StorageClass'
No property 'STATU' found for type 'StorageClass'
No property 'STAT' found for type 'StorageClass'
No property 'STA' found for type 'StorageClass'
No property 'ST' found for type 'StorageClass'
No property 's' found for type 'StorageClass'
No property 'FIELD' found for type 'StorageClass'
No property 'FIEL' found for type 'StorageClass'
No property 'FIE' found for type 'StorageClass'
No property 'FI' found for type 'StorageClass'
No property 'f' found for type 'StorageClass'
No property 'FIELD_NUMBER' found for type 'StorageClass'
No property 'FIELD_NUMBE' found for type 'StorageClass'
No property 'FIELD_NUMB' found for type 'StorageClass
No property 'FIELD_NUM' found for type 'StorageClass'
No property 'FIELD_NU' found for type 'StorageClass'
No property 'FIELD_N' found for type 'StorageClass''
No property 'FIELD_' found for type 'StorageClass' 
```

For every interaction, it throwed 118 instances of this class, on these two points:

```
Exception 'org.springframework.data.mapping.PropertyReferenceException' occurred in thread 'scheduling-1' at org.springframework.data.mapping.PropertyPath.<init>(PropertyPath.java:94)
Exception 'org.springframework.data.mapping.PropertyReferenceException' occurred in thread 'scheduling-1' at org.springframework.data.mapping.PropertyPath.create(PropertyPath.java:494)
```