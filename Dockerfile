FROM airhacks/glassfish
COPY ./target/javaeejpa.war ${DEPLOYMENT_DIR}
