// Stub class generated by rmic, do not edit.
// Contents subject to change without notice.

package j.service.router;

import j.app.webserver.JSession;
import j.service.server.ServiceBase;
import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.UnexpectedException;
import javax.rmi.CORBA.Stub;
import javax.rmi.CORBA.Util;
import javax.rmi.PortableRemoteObject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.omg.CORBA.ORB;
import org.omg.CORBA.SystemException;
import org.omg.CORBA.portable.ApplicationException;
import org.omg.CORBA.portable.InputStream;
import org.omg.CORBA.portable.OutputStream;
import org.omg.CORBA.portable.RemarshalException;
import org.omg.CORBA.portable.ResponseHandler;
import org.omg.CORBA.portable.ServantObject;


public class _JRouter_Stub extends Stub implements JRouter {
    
    private static final String[] _type_ids = {
        "RMI:j.service.router.JRouter:0000000000000000"
    };
    
        public String[] _ids() { 
            return (String[]) _type_ids.clone();
        }
        
        public void setRouterConfig(RouterConfig arg0) throws java.rmi.RemoteException {
            if (!Util.isLocal(this)) {
                try {
                    org.omg.CORBA_2_3.portable.InputStream in = null;
                    try {
                        org.omg.CORBA_2_3.portable.OutputStream out = 
                            (org.omg.CORBA_2_3.portable.OutputStream)
                            _request("_set_routerConfig", true);
                        out.write_value(arg0,RouterConfig.class);
                        _invoke(out);
                    } catch (ApplicationException ex) {
                        in = (org.omg.CORBA_2_3.portable.InputStream) ex.getInputStream();
                        String $_id = in.read_string();
                        throw new UnexpectedException($_id);
                    } catch (RemarshalException ex) {
                        setRouterConfig(arg0);
                    } finally {
                        _releaseReply(in);
                    }
                } catch (SystemException ex) {
                    throw Util.mapSystemException(ex);
                }
            } else {
                ServantObject so = _servant_preinvoke("_set_routerConfig",JRouter.class);
                if (so == null) {
                    setRouterConfig(arg0);
                    return ;
                }
                try {
                    RouterConfig arg0Copy = (RouterConfig) Util.copyObject(arg0,_orb());
                    ((JRouter)so.servant).setRouterConfig(arg0Copy);
                } catch (Throwable ex) {
                    Throwable exCopy = (Throwable)Util.copyObject(ex,_orb());
                    throw Util.wrapException(exCopy);
                } finally {
                    _servant_postinvoke(so);
                }
            }
        }
        
        public RouterConfig getRouterConfig() throws java.rmi.RemoteException {
            if (!Util.isLocal(this)) {
                try {
                    org.omg.CORBA_2_3.portable.InputStream in = null;
                    try {
                        OutputStream out = _request("_get_routerConfig", true);
                        in = (org.omg.CORBA_2_3.portable.InputStream)_invoke(out);
                        return (RouterConfig) in.read_value(RouterConfig.class);
                    } catch (ApplicationException ex) {
                        in = (org.omg.CORBA_2_3.portable.InputStream) ex.getInputStream();
                        String $_id = in.read_string();
                        throw new UnexpectedException($_id);
                    } catch (RemarshalException ex) {
                        return getRouterConfig();
                    } finally {
                        _releaseReply(in);
                    }
                } catch (SystemException ex) {
                    throw Util.mapSystemException(ex);
                }
            } else {
                ServantObject so = _servant_preinvoke("_get_routerConfig",JRouter.class);
                if (so == null) {
                    return getRouterConfig();
                }
                try {
                    RouterConfig result = ((JRouter)so.servant).getRouterConfig();
                    return (RouterConfig)Util.copyObject(result,_orb());
                } catch (Throwable ex) {
                    Throwable exCopy = (Throwable)Util.copyObject(ex,_orb());
                    throw Util.wrapException(exCopy);
                } finally {
                    _servant_postinvoke(so);
                }
            }
        }
        
        public void startup() throws java.rmi.RemoteException {
            if (!Util.isLocal(this)) {
                try {
                    org.omg.CORBA.portable.InputStream in = null;
                    try {
                        OutputStream out = _request("startup", true);
                        _invoke(out);
                    } catch (ApplicationException ex) {
                        in = ex.getInputStream();
                        String $_id = in.read_string();
                        throw new UnexpectedException($_id);
                    } catch (RemarshalException ex) {
                        startup();
                    } finally {
                        _releaseReply(in);
                    }
                } catch (SystemException ex) {
                    throw Util.mapSystemException(ex);
                }
            } else {
                ServantObject so = _servant_preinvoke("startup",JRouter.class);
                if (so == null) {
                    startup();
                    return ;
                }
                try {
                    ((JRouter)so.servant).startup();
                } catch (Throwable ex) {
                    Throwable exCopy = (Throwable)Util.copyObject(ex,_orb());
                    throw Util.wrapException(exCopy);
                } finally {
                    _servant_postinvoke(so);
                }
            }
        }
        
        public void shutdown() throws java.rmi.RemoteException {
            if (!Util.isLocal(this)) {
                try {
                    org.omg.CORBA.portable.InputStream in = null;
                    try {
                        OutputStream out = _request("shutdown", true);
                        _invoke(out);
                    } catch (ApplicationException ex) {
                        in = ex.getInputStream();
                        String $_id = in.read_string();
                        throw new UnexpectedException($_id);
                    } catch (RemarshalException ex) {
                        shutdown();
                    } finally {
                        _releaseReply(in);
                    }
                } catch (SystemException ex) {
                    throw Util.mapSystemException(ex);
                }
            } else {
                ServantObject so = _servant_preinvoke("shutdown",JRouter.class);
                if (so == null) {
                    shutdown();
                    return ;
                }
                try {
                    ((JRouter)so.servant).shutdown();
                } catch (Throwable ex) {
                    Throwable exCopy = (Throwable)Util.copyObject(ex,_orb());
                    throw Util.wrapException(exCopy);
                } finally {
                    _servant_postinvoke(so);
                }
            }
        }
        
        public void register(JSession arg0, HttpSession arg1, HttpServletRequest arg2, HttpServletResponse arg3) throws java.rmi.RemoteException {
            if (!Util.isLocal(this)) {
                try {
                    org.omg.CORBA_2_3.portable.InputStream in = null;
                    try {
                        org.omg.CORBA_2_3.portable.OutputStream out = 
                            (org.omg.CORBA_2_3.portable.OutputStream)
                            _request("register__j_app_webserver_JSession__javax_servlet_http_HttpSession__javax_servlet_http_HttpServletRequest__javax_servlet_http_HttpServletResponse", true);
                        out.write_value((Serializable)arg0,JSession.class);
                        out.write_value((Serializable)arg1,HttpSession.class);
                        out.write_value((Serializable)arg2,HttpServletRequest.class);
                        out.write_value((Serializable)arg3,HttpServletResponse.class);
                        _invoke(out);
                    } catch (ApplicationException ex) {
                        in = (org.omg.CORBA_2_3.portable.InputStream) ex.getInputStream();
                        String $_id = in.read_string();
                        throw new UnexpectedException($_id);
                    } catch (RemarshalException ex) {
                        register(arg0,arg1,arg2,arg3);
                    } finally {
                        _releaseReply(in);
                    }
                } catch (SystemException ex) {
                    throw Util.mapSystemException(ex);
                }
            } else {
                ServantObject so = _servant_preinvoke("register__j_app_webserver_JSession__javax_servlet_http_HttpSession__javax_servlet_http_HttpServletRequest__javax_servlet_http_HttpServletResponse",JRouter.class);
                if (so == null) {
                    register(arg0, arg1, arg2, arg3);
                    return ;
                }
                try {
                    Object[] copies = Util.copyObjects(new Object[]{arg0,arg1,arg2,arg3},_orb());
                    JSession arg0Copy = (JSession) copies[0];
                    HttpSession arg1Copy = (HttpSession) copies[1];
                    HttpServletRequest arg2Copy = (HttpServletRequest) copies[2];
                    HttpServletResponse arg3Copy = (HttpServletResponse) copies[3];
                    ((JRouter)so.servant).register(arg0Copy, arg1Copy, arg2Copy, arg3Copy);
                } catch (Throwable ex) {
                    Throwable exCopy = (Throwable)Util.copyObject(ex,_orb());
                    throw Util.wrapException(exCopy);
                } finally {
                    _servant_postinvoke(so);
                }
            }
        }
        
        public void unregister(JSession arg0, HttpSession arg1, HttpServletRequest arg2, HttpServletResponse arg3) throws java.rmi.RemoteException {
            if (!Util.isLocal(this)) {
                try {
                    org.omg.CORBA_2_3.portable.InputStream in = null;
                    try {
                        org.omg.CORBA_2_3.portable.OutputStream out = 
                            (org.omg.CORBA_2_3.portable.OutputStream)
                            _request("unregister__j_app_webserver_JSession__javax_servlet_http_HttpSession__javax_servlet_http_HttpServletRequest__javax_servlet_http_HttpServletResponse", true);
                        out.write_value((Serializable)arg0,JSession.class);
                        out.write_value((Serializable)arg1,HttpSession.class);
                        out.write_value((Serializable)arg2,HttpServletRequest.class);
                        out.write_value((Serializable)arg3,HttpServletResponse.class);
                        _invoke(out);
                    } catch (ApplicationException ex) {
                        in = (org.omg.CORBA_2_3.portable.InputStream) ex.getInputStream();
                        String $_id = in.read_string();
                        throw new UnexpectedException($_id);
                    } catch (RemarshalException ex) {
                        unregister(arg0,arg1,arg2,arg3);
                    } finally {
                        _releaseReply(in);
                    }
                } catch (SystemException ex) {
                    throw Util.mapSystemException(ex);
                }
            } else {
                ServantObject so = _servant_preinvoke("unregister__j_app_webserver_JSession__javax_servlet_http_HttpSession__javax_servlet_http_HttpServletRequest__javax_servlet_http_HttpServletResponse",JRouter.class);
                if (so == null) {
                    unregister(arg0, arg1, arg2, arg3);
                    return ;
                }
                try {
                    Object[] copies = Util.copyObjects(new Object[]{arg0,arg1,arg2,arg3},_orb());
                    JSession arg0Copy = (JSession) copies[0];
                    HttpSession arg1Copy = (HttpSession) copies[1];
                    HttpServletRequest arg2Copy = (HttpServletRequest) copies[2];
                    HttpServletResponse arg3Copy = (HttpServletResponse) copies[3];
                    ((JRouter)so.servant).unregister(arg0Copy, arg1Copy, arg2Copy, arg3Copy);
                } catch (Throwable ex) {
                    Throwable exCopy = (Throwable)Util.copyObject(ex,_orb());
                    throw Util.wrapException(exCopy);
                } finally {
                    _servant_postinvoke(so);
                }
            }
        }
        
        public void service(JSession arg0, HttpSession arg1, HttpServletRequest arg2, HttpServletResponse arg3) throws java.rmi.RemoteException {
            if (!Util.isLocal(this)) {
                try {
                    org.omg.CORBA_2_3.portable.InputStream in = null;
                    try {
                        org.omg.CORBA_2_3.portable.OutputStream out = 
                            (org.omg.CORBA_2_3.portable.OutputStream)
                            _request("service__j_app_webserver_JSession__javax_servlet_http_HttpSession__javax_servlet_http_HttpServletRequest__javax_servlet_http_HttpServletResponse", true);
                        out.write_value((Serializable)arg0,JSession.class);
                        out.write_value((Serializable)arg1,HttpSession.class);
                        out.write_value((Serializable)arg2,HttpServletRequest.class);
                        out.write_value((Serializable)arg3,HttpServletResponse.class);
                        _invoke(out);
                    } catch (ApplicationException ex) {
                        in = (org.omg.CORBA_2_3.portable.InputStream) ex.getInputStream();
                        String $_id = in.read_string();
                        throw new UnexpectedException($_id);
                    } catch (RemarshalException ex) {
                        service(arg0,arg1,arg2,arg3);
                    } finally {
                        _releaseReply(in);
                    }
                } catch (SystemException ex) {
                    throw Util.mapSystemException(ex);
                }
            } else {
                ServantObject so = _servant_preinvoke("service__j_app_webserver_JSession__javax_servlet_http_HttpSession__javax_servlet_http_HttpServletRequest__javax_servlet_http_HttpServletResponse",JRouter.class);
                if (so == null) {
                    service(arg0, arg1, arg2, arg3);
                    return ;
                }
                try {
                    Object[] copies = Util.copyObjects(new Object[]{arg0,arg1,arg2,arg3},_orb());
                    JSession arg0Copy = (JSession) copies[0];
                    HttpSession arg1Copy = (HttpSession) copies[1];
                    HttpServletRequest arg2Copy = (HttpServletRequest) copies[2];
                    HttpServletResponse arg3Copy = (HttpServletResponse) copies[3];
                    ((JRouter)so.servant).service(arg0Copy, arg1Copy, arg2Copy, arg3Copy);
                } catch (Throwable ex) {
                    Throwable exCopy = (Throwable)Util.copyObject(ex,_orb());
                    throw Util.wrapException(exCopy);
                } finally {
                    _servant_postinvoke(so);
                }
            }
        }
        
        public void getAllServiceNodeAvailable(JSession arg0, HttpSession arg1, HttpServletRequest arg2, HttpServletResponse arg3) throws java.rmi.RemoteException {
            if (!Util.isLocal(this)) {
                try {
                    org.omg.CORBA_2_3.portable.InputStream in = null;
                    try {
                        org.omg.CORBA_2_3.portable.OutputStream out = 
                            (org.omg.CORBA_2_3.portable.OutputStream)
                            _request("getAllServiceNodeAvailable__j_app_webserver_JSession__javax_servlet_http_HttpSession__javax_servlet_http_HttpServletRequest__javax_servlet_http_HttpServletResponse", true);
                        out.write_value((Serializable)arg0,JSession.class);
                        out.write_value((Serializable)arg1,HttpSession.class);
                        out.write_value((Serializable)arg2,HttpServletRequest.class);
                        out.write_value((Serializable)arg3,HttpServletResponse.class);
                        _invoke(out);
                    } catch (ApplicationException ex) {
                        in = (org.omg.CORBA_2_3.portable.InputStream) ex.getInputStream();
                        String $_id = in.read_string();
                        throw new UnexpectedException($_id);
                    } catch (RemarshalException ex) {
                        getAllServiceNodeAvailable(arg0,arg1,arg2,arg3);
                    } finally {
                        _releaseReply(in);
                    }
                } catch (SystemException ex) {
                    throw Util.mapSystemException(ex);
                }
            } else {
                ServantObject so = _servant_preinvoke("getAllServiceNodeAvailable__j_app_webserver_JSession__javax_servlet_http_HttpSession__javax_servlet_http_HttpServletRequest__javax_servlet_http_HttpServletResponse",JRouter.class);
                if (so == null) {
                    getAllServiceNodeAvailable(arg0, arg1, arg2, arg3);
                    return ;
                }
                try {
                    Object[] copies = Util.copyObjects(new Object[]{arg0,arg1,arg2,arg3},_orb());
                    JSession arg0Copy = (JSession) copies[0];
                    HttpSession arg1Copy = (HttpSession) copies[1];
                    HttpServletRequest arg2Copy = (HttpServletRequest) copies[2];
                    HttpServletResponse arg3Copy = (HttpServletResponse) copies[3];
                    ((JRouter)so.servant).getAllServiceNodeAvailable(arg0Copy, arg1Copy, arg2Copy, arg3Copy);
                } catch (Throwable ex) {
                    Throwable exCopy = (Throwable)Util.copyObject(ex,_orb());
                    throw Util.wrapException(exCopy);
                } finally {
                    _servant_postinvoke(so);
                }
            }
        }
        
        public String register(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws java.rmi.RemoteException {
            if (!Util.isLocal(this)) {
                try {
                    org.omg.CORBA_2_3.portable.InputStream in = null;
                    try {
                        org.omg.CORBA_2_3.portable.OutputStream out = 
                            (org.omg.CORBA_2_3.portable.OutputStream)
                            _request("register__CORBA_WStringValue__CORBA_WStringValue__CORBA_WStringValue__CORBA_WStringValue__CORBA_WStringValue__CORBA_WStringValue__CORBA_WStringValue", true);
                        out.write_value(arg0,String.class);
                        out.write_value(arg1,String.class);
                        out.write_value(arg2,String.class);
                        out.write_value(arg3,String.class);
                        out.write_value(arg4,String.class);
                        out.write_value(arg5,String.class);
                        out.write_value(arg6,String.class);
                        in = (org.omg.CORBA_2_3.portable.InputStream)_invoke(out);
                        return (String) in.read_value(String.class);
                    } catch (ApplicationException ex) {
                        in = (org.omg.CORBA_2_3.portable.InputStream) ex.getInputStream();
                        String $_id = in.read_string();
                        throw new UnexpectedException($_id);
                    } catch (RemarshalException ex) {
                        return register(arg0,arg1,arg2,arg3,arg4,arg5,arg6);
                    } finally {
                        _releaseReply(in);
                    }
                } catch (SystemException ex) {
                    throw Util.mapSystemException(ex);
                }
            } else {
                ServantObject so = _servant_preinvoke("register__CORBA_WStringValue__CORBA_WStringValue__CORBA_WStringValue__CORBA_WStringValue__CORBA_WStringValue__CORBA_WStringValue__CORBA_WStringValue",JRouter.class);
                if (so == null) {
                    return register(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
                }
                try {
                    return ((JRouter)so.servant).register(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
                } catch (Throwable ex) {
                    Throwable exCopy = (Throwable)Util.copyObject(ex,_orb());
                    throw Util.wrapException(exCopy);
                } finally {
                    _servant_postinvoke(so);
                }
            }
        }
        
        public String unregister(String arg0, String arg1, String arg2, String arg3) throws java.rmi.RemoteException {
            if (!Util.isLocal(this)) {
                try {
                    org.omg.CORBA_2_3.portable.InputStream in = null;
                    try {
                        org.omg.CORBA_2_3.portable.OutputStream out = 
                            (org.omg.CORBA_2_3.portable.OutputStream)
                            _request("unregister__CORBA_WStringValue__CORBA_WStringValue__CORBA_WStringValue__CORBA_WStringValue", true);
                        out.write_value(arg0,String.class);
                        out.write_value(arg1,String.class);
                        out.write_value(arg2,String.class);
                        out.write_value(arg3,String.class);
                        in = (org.omg.CORBA_2_3.portable.InputStream)_invoke(out);
                        return (String) in.read_value(String.class);
                    } catch (ApplicationException ex) {
                        in = (org.omg.CORBA_2_3.portable.InputStream) ex.getInputStream();
                        String $_id = in.read_string();
                        throw new UnexpectedException($_id);
                    } catch (RemarshalException ex) {
                        return unregister(arg0,arg1,arg2,arg3);
                    } finally {
                        _releaseReply(in);
                    }
                } catch (SystemException ex) {
                    throw Util.mapSystemException(ex);
                }
            } else {
                ServantObject so = _servant_preinvoke("unregister__CORBA_WStringValue__CORBA_WStringValue__CORBA_WStringValue__CORBA_WStringValue",JRouter.class);
                if (so == null) {
                    return unregister(arg0, arg1, arg2, arg3);
                }
                try {
                    return ((JRouter)so.servant).unregister(arg0, arg1, arg2, arg3);
                } catch (Throwable ex) {
                    Throwable exCopy = (Throwable)Util.copyObject(ex,_orb());
                    throw Util.wrapException(exCopy);
                } finally {
                    _servant_postinvoke(so);
                }
            }
        }
        
        public ServiceBase service(String arg0, String arg1, String arg2) throws java.rmi.RemoteException {
            if (!Util.isLocal(this)) {
                try {
                    org.omg.CORBA_2_3.portable.InputStream in = null;
                    try {
                        org.omg.CORBA_2_3.portable.OutputStream out = 
                            (org.omg.CORBA_2_3.portable.OutputStream)
                            _request("service__CORBA_WStringValue__CORBA_WStringValue__CORBA_WStringValue", true);
                        out.write_value(arg0,String.class);
                        out.write_value(arg1,String.class);
                        out.write_value(arg2,String.class);
                        in = (org.omg.CORBA_2_3.portable.InputStream)_invoke(out);
                        return (ServiceBase) PortableRemoteObject.narrow(in.read_Object(), ServiceBase.class);
                    } catch (ApplicationException ex) {
                        in = (org.omg.CORBA_2_3.portable.InputStream) ex.getInputStream();
                        String $_id = in.read_string();
                        throw new UnexpectedException($_id);
                    } catch (RemarshalException ex) {
                        return service(arg0,arg1,arg2);
                    } finally {
                        _releaseReply(in);
                    }
                } catch (SystemException ex) {
                    throw Util.mapSystemException(ex);
                }
            } else {
                ServantObject so = _servant_preinvoke("service__CORBA_WStringValue__CORBA_WStringValue__CORBA_WStringValue",JRouter.class);
                if (so == null) {
                    return service(arg0, arg1, arg2);
                }
                try {
                    ServiceBase result = ((JRouter)so.servant).service(arg0, arg1, arg2);
                    return (ServiceBase)Util.copyObject(result,_orb());
                } catch (Throwable ex) {
                    Throwable exCopy = (Throwable)Util.copyObject(ex,_orb());
                    throw Util.wrapException(exCopy);
                } finally {
                    _servant_postinvoke(so);
                }
            }
        }
        
        public ServiceBase[] getAllServiceNodeAvailable(String arg0, String arg1, String arg2) throws java.rmi.RemoteException {
            if (!Util.isLocal(this)) {
                try {
                    org.omg.CORBA_2_3.portable.InputStream in = null;
                    try {
                        org.omg.CORBA_2_3.portable.OutputStream out = 
                            (org.omg.CORBA_2_3.portable.OutputStream)
                            _request("getAllServiceNodeAvailable__CORBA_WStringValue__CORBA_WStringValue__CORBA_WStringValue", true);
                        out.write_value(arg0,String.class);
                        out.write_value(arg1,String.class);
                        out.write_value(arg2,String.class);
                        in = (org.omg.CORBA_2_3.portable.InputStream)_invoke(out);
                        return (ServiceBase[]) in.read_value(ServiceBase[].class);
                    } catch (ApplicationException ex) {
                        in = (org.omg.CORBA_2_3.portable.InputStream) ex.getInputStream();
                        String $_id = in.read_string();
                        throw new UnexpectedException($_id);
                    } catch (RemarshalException ex) {
                        return getAllServiceNodeAvailable(arg0,arg1,arg2);
                    } finally {
                        _releaseReply(in);
                    }
                } catch (SystemException ex) {
                    throw Util.mapSystemException(ex);
                }
            } else {
                ServantObject so = _servant_preinvoke("getAllServiceNodeAvailable__CORBA_WStringValue__CORBA_WStringValue__CORBA_WStringValue",JRouter.class);
                if (so == null) {
                    return getAllServiceNodeAvailable(arg0, arg1, arg2);
                }
                try {
                    ServiceBase[] result = ((JRouter)so.servant).getAllServiceNodeAvailable(arg0, arg1, arg2);
                    return (ServiceBase[])Util.copyObject(result,_orb());
                } catch (Throwable ex) {
                    Throwable exCopy = (Throwable)Util.copyObject(ex,_orb());
                    throw Util.wrapException(exCopy);
                } finally {
                    _servant_postinvoke(so);
                }
            }
        }
        
        public String heartbeat() throws java.rmi.RemoteException {
            if (!Util.isLocal(this)) {
                try {
                    org.omg.CORBA_2_3.portable.InputStream in = null;
                    try {
                        OutputStream out = _request("heartbeat__", true);
                        in = (org.omg.CORBA_2_3.portable.InputStream)_invoke(out);
                        return (String) in.read_value(String.class);
                    } catch (ApplicationException ex) {
                        in = (org.omg.CORBA_2_3.portable.InputStream) ex.getInputStream();
                        String $_id = in.read_string();
                        throw new UnexpectedException($_id);
                    } catch (RemarshalException ex) {
                        return heartbeat();
                    } finally {
                        _releaseReply(in);
                    }
                } catch (SystemException ex) {
                    throw Util.mapSystemException(ex);
                }
            } else {
                ServantObject so = _servant_preinvoke("heartbeat__",JRouter.class);
                if (so == null) {
                    return heartbeat();
                }
                try {
                    return ((JRouter)so.servant).heartbeat();
                } catch (Throwable ex) {
                    Throwable exCopy = (Throwable)Util.copyObject(ex,_orb());
                    throw Util.wrapException(exCopy);
                } finally {
                    _servant_postinvoke(so);
                }
            }
        }
        
        public void heartbeat(JSession arg0, HttpSession arg1, HttpServletRequest arg2, HttpServletResponse arg3) throws java.rmi.RemoteException {
            if (!Util.isLocal(this)) {
                try {
                    org.omg.CORBA_2_3.portable.InputStream in = null;
                    try {
                        org.omg.CORBA_2_3.portable.OutputStream out = 
                            (org.omg.CORBA_2_3.portable.OutputStream)
                            _request("heartbeat__j_app_webserver_JSession__javax_servlet_http_HttpSession__javax_servlet_http_HttpServletRequest__javax_servlet_http_HttpServletResponse", true);
                        out.write_value((Serializable)arg0,JSession.class);
                        out.write_value((Serializable)arg1,HttpSession.class);
                        out.write_value((Serializable)arg2,HttpServletRequest.class);
                        out.write_value((Serializable)arg3,HttpServletResponse.class);
                        _invoke(out);
                    } catch (ApplicationException ex) {
                        in = (org.omg.CORBA_2_3.portable.InputStream) ex.getInputStream();
                        String $_id = in.read_string();
                        throw new UnexpectedException($_id);
                    } catch (RemarshalException ex) {
                        heartbeat(arg0,arg1,arg2,arg3);
                    } finally {
                        _releaseReply(in);
                    }
                } catch (SystemException ex) {
                    throw Util.mapSystemException(ex);
                }
            } else {
                ServantObject so = _servant_preinvoke("heartbeat__j_app_webserver_JSession__javax_servlet_http_HttpSession__javax_servlet_http_HttpServletRequest__javax_servlet_http_HttpServletResponse",JRouter.class);
                if (so == null) {
                    heartbeat(arg0, arg1, arg2, arg3);
                    return ;
                }
                try {
                    Object[] copies = Util.copyObjects(new Object[]{arg0,arg1,arg2,arg3},_orb());
                    JSession arg0Copy = (JSession) copies[0];
                    HttpSession arg1Copy = (HttpSession) copies[1];
                    HttpServletRequest arg2Copy = (HttpServletRequest) copies[2];
                    HttpServletResponse arg3Copy = (HttpServletResponse) copies[3];
                    ((JRouter)so.servant).heartbeat(arg0Copy, arg1Copy, arg2Copy, arg3Copy);
                } catch (Throwable ex) {
                    Throwable exCopy = (Throwable)Util.copyObject(ex,_orb());
                    throw Util.wrapException(exCopy);
                } finally {
                    _servant_postinvoke(so);
                }
            }
        }
    }
