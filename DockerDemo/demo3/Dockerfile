# If not given version, docker will take latest version by default
FROM alpine
# We want to add python (because we are using alpine we need to install it in alpine commands)
RUN apk add python3
# We add adress we want to ping in our demo
CMD ["8.8.8.8"]
# We are saying main process will be 5 pings
ENTRYPOINT ["ping", "-t", "5"]
