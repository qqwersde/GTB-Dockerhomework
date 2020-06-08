#使用JDK8环境作为基础镜像
FROM java:8

#拷贝JRA包
COPY build/libs/alice-0.0.1-SNAPSHOT.jar aliceapp.jar
#容器启动执行
ENTRYPOINT ["java","-jar","/aliceapp.jar"]

#暴露端口
EXPOSE 8080