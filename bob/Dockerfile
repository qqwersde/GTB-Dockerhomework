#使用JDK8环境作为基础镜像
FROM java:8

#拷贝JRA包
COPY build/libs/bob-0.0.1-SNAPSHOT.jar bobapp.jar
#容器启动执行
ENTRYPOINT ["java","-jar","/bobapp.jar"]

#暴露端口
EXPOSE 8081