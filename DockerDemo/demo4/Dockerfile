# Wrapup project
FROM alpine
RUN apk add apache2
COPY . /usr/local/apache2/htdocs/
EXPOSE 80
CMD ["-D", "FOREGROUND"]
ENTRYPOINT ["/usr/sbin/httpd"]