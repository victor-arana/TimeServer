package ch01.ts;

import javax.xml.ws.Endpoint;

public class TimeServerPublisher {

    /**
     * This application publishes the web service whose
     * SIB is ch01.ts.TimeServerImpl. For now, the
     * service is published at network address 127.0.0.1. ,
     * which is localhost, and at port number 9876, as this
     * port is likely available on any desktop machine. The
     * publication path is /ts, an arbitraty name.
     *
     * The Endpoint class has an overloaded publish method.
     * In this two-argument version, the first argument is the
     * publication URL as a string and the second argument is
     * an instance of the service SIB, in this case
     * ch01.ts.TimeServerImpl.
     *
     * The application runs indefinitely, awaiting service requests.
     * It needs to be terminated at the command prompt with control-C
     * or the equivalent.
     *
     * Once the application is started, open a browser to the URL
     *
     *  http://127.0.0.1:9876/ts?wsdl
     *
     * to view the service contract, the WSDL document. this is an
     * easy test to determine whether the service has deployed successfully.
     * If the test succeeds, a client then can be execued against the service.
     * @param args
     */
    public static void main(String[]  args){
        // 1st argument is the publication URL
        // 2nd argument is the SIB instance
        Endpoint.publish("http://127.0.0.1:9876/ts", new TimeServerImpl());
        System.out.println("Running");
    }
}
