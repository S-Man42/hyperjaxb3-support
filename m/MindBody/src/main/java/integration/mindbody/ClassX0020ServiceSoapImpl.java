
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package integration.mindbody;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.5.6
 * 2015-03-18T22:34:36.298+02:00
 * Generated source version: 2.5.6
 * 
 */

@javax.jws.WebService(
                      serviceName = "Class_x0020_Service",
                      portName = "Class_x0020_ServiceSoap",
                      targetNamespace = "http://clients.mindbodyonline.com/api/0_5",
                      wsdlLocation = "https://api.mindbodyonline.com/0_5/ClassService.asmx?wsdl",
                      endpointInterface = "integration.mindbody.ClassX0020ServiceSoap")
                      
public class ClassX0020ServiceSoapImpl implements ClassX0020ServiceSoap {

    private static final Logger LOG = Logger.getLogger(ClassX0020ServiceSoapImpl.class.getName());

    /* (non-Javadoc)
     * @see integration.mindbody.ClassX0020ServiceSoap#getClassSchedules(integration.mindbody.GetClassSchedules  parameters )*
     */
    public integration.mindbody.GetClassSchedulesResponse getClassSchedules(GetClassSchedules parameters) { 
        LOG.info("Executing operation getClassSchedules");
        System.out.println(parameters);
        try {
            integration.mindbody.GetClassSchedulesResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see integration.mindbody.ClassX0020ServiceSoap#removeFromWaitlist(integration.mindbody.RemoveFromWaitlist  parameters )*
     */
    public integration.mindbody.RemoveFromWaitlistResponse removeFromWaitlist(RemoveFromWaitlist parameters) { 
        LOG.info("Executing operation removeFromWaitlist");
        System.out.println(parameters);
        try {
            integration.mindbody.RemoveFromWaitlistResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see integration.mindbody.ClassX0020ServiceSoap#getClasses(integration.mindbody.GetClasses  parameters )*
     */
    public integration.mindbody.GetClassesResponse getClasses(GetClasses parameters) { 
        LOG.info("Executing operation getClasses");
        System.out.println(parameters);
        try {
            integration.mindbody.GetClassesResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see integration.mindbody.ClassX0020ServiceSoap#getSemesters(integration.mindbody.GetSemesters  parameters )*
     */
    public integration.mindbody.GetSemestersResponse getSemesters(GetSemesters parameters) { 
        LOG.info("Executing operation getSemesters");
        System.out.println(parameters);
        try {
            integration.mindbody.GetSemestersResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see integration.mindbody.ClassX0020ServiceSoap#addClientsToEnrollments(integration.mindbody.AddClientsToEnrollments  parameters )*
     */
    public integration.mindbody.AddClientsToEnrollmentsResponse addClientsToEnrollments(AddClientsToEnrollments parameters) { 
        LOG.info("Executing operation addClientsToEnrollments");
        System.out.println(parameters);
        try {
            integration.mindbody.AddClientsToEnrollmentsResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see integration.mindbody.ClassX0020ServiceSoap#getCourses(integration.mindbody.GetCourses  parameters )*
     */
    public integration.mindbody.GetCoursesResponse getCourses(GetCourses parameters) { 
        LOG.info("Executing operation getCourses");
        System.out.println(parameters);
        try {
            integration.mindbody.GetCoursesResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see integration.mindbody.ClassX0020ServiceSoap#updateClientVisits(integration.mindbody.UpdateClientVisits  parameters )*
     */
    public integration.mindbody.UpdateClientVisitsResponse updateClientVisits(UpdateClientVisits parameters) { 
        LOG.info("Executing operation updateClientVisits");
        System.out.println(parameters);
        try {
            integration.mindbody.UpdateClientVisitsResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see integration.mindbody.ClassX0020ServiceSoap#getEnrollments(integration.mindbody.GetEnrollments  parameters )*
     */
    public integration.mindbody.GetEnrollmentsResponse getEnrollments(GetEnrollments parameters) { 
        LOG.info("Executing operation getEnrollments");
        System.out.println(parameters);
        try {
            integration.mindbody.GetEnrollmentsResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see integration.mindbody.ClassX0020ServiceSoap#removeClientsFromClasses(integration.mindbody.RemoveClientsFromClasses  parameters )*
     */
    public integration.mindbody.RemoveClientsFromClassesResponse removeClientsFromClasses(RemoveClientsFromClasses parameters) { 
        LOG.info("Executing operation removeClientsFromClasses");
        System.out.println(parameters);
        try {
            integration.mindbody.RemoveClientsFromClassesResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see integration.mindbody.ClassX0020ServiceSoap#addClientsToClasses(integration.mindbody.AddClientsToClasses  parameters )*
     */
    public integration.mindbody.AddClientsToClassesResponse addClientsToClasses(AddClientsToClasses parameters) { 
        LOG.info("Executing operation addClientsToClasses");
        System.out.println(parameters);
        try {
            integration.mindbody.AddClientsToClassesResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see integration.mindbody.ClassX0020ServiceSoap#getWaitlistEntries(integration.mindbody.GetWaitlistEntries  parameters )*
     */
    public integration.mindbody.GetWaitlistEntriesResponse getWaitlistEntries(GetWaitlistEntries parameters) { 
        LOG.info("Executing operation getWaitlistEntries");
        System.out.println(parameters);
        try {
            integration.mindbody.GetWaitlistEntriesResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see integration.mindbody.ClassX0020ServiceSoap#getClassVisits(integration.mindbody.GetClassVisits  parameters )*
     */
    public integration.mindbody.GetClassVisitsResponse getClassVisits(GetClassVisits parameters) { 
        LOG.info("Executing operation getClassVisits");
        System.out.println(parameters);
        try {
            integration.mindbody.GetClassVisitsResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see integration.mindbody.ClassX0020ServiceSoap#getClassDescriptions(integration.mindbody.GetClassDescriptions  parameters )*
     */
    public integration.mindbody.GetClassDescriptionsResponse getClassDescriptions(GetClassDescriptions parameters) { 
        LOG.info("Executing operation getClassDescriptions");
        System.out.println(parameters);
        try {
            integration.mindbody.GetClassDescriptionsResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}