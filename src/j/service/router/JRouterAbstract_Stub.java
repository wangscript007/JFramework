// Stub class generated by rmic, do not edit.
// Contents subject to change without notice.

package j.service.router;

public final class JRouterAbstract_Stub
    extends java.rmi.server.RemoteStub
    implements j.service.router.JRouter
{
    private static final long serialVersionUID = 2;
    
    private static java.lang.reflect.Method $method_getAllServiceNodeAvailable_0;
    private static java.lang.reflect.Method $method_getAllServiceNodeAvailable_1;
    private static java.lang.reflect.Method $method_getRouterConfig_2;
    private static java.lang.reflect.Method $method_heartbeat_3;
    private static java.lang.reflect.Method $method_heartbeat_4;
    private static java.lang.reflect.Method $method_register_5;
    private static java.lang.reflect.Method $method_register_6;
    private static java.lang.reflect.Method $method_service_7;
    private static java.lang.reflect.Method $method_service_8;
    private static java.lang.reflect.Method $method_setRouterConfig_9;
    private static java.lang.reflect.Method $method_shutdown_10;
    private static java.lang.reflect.Method $method_startup_11;
    private static java.lang.reflect.Method $method_unregister_12;
    private static java.lang.reflect.Method $method_unregister_13;
    
    static {
	try {
	    $method_getAllServiceNodeAvailable_0 = j.service.router.JRouter.class.getMethod("getAllServiceNodeAvailable", new java.lang.Class[] {j.app.webserver.JSession.class, javax.servlet.http.HttpSession.class, javax.servlet.http.HttpServletRequest.class, javax.servlet.http.HttpServletResponse.class});
	    $method_getAllServiceNodeAvailable_1 = j.service.router.JRouter.class.getMethod("getAllServiceNodeAvailable", new java.lang.Class[] {java.lang.String.class, java.lang.String.class, java.lang.String.class});
	    $method_getRouterConfig_2 = j.service.router.JRouter.class.getMethod("getRouterConfig", new java.lang.Class[] {});
	    $method_heartbeat_3 = j.service.router.JRouter.class.getMethod("heartbeat", new java.lang.Class[] {});
	    $method_heartbeat_4 = j.service.router.JRouter.class.getMethod("heartbeat", new java.lang.Class[] {j.app.webserver.JSession.class, javax.servlet.http.HttpSession.class, javax.servlet.http.HttpServletRequest.class, javax.servlet.http.HttpServletResponse.class});
	    $method_register_5 = j.service.router.JRouter.class.getMethod("register", new java.lang.Class[] {j.app.webserver.JSession.class, javax.servlet.http.HttpSession.class, javax.servlet.http.HttpServletRequest.class, javax.servlet.http.HttpServletResponse.class});
	    $method_register_6 = j.service.router.JRouter.class.getMethod("register", new java.lang.Class[] {java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class});
	    $method_service_7 = j.service.router.JRouter.class.getMethod("service", new java.lang.Class[] {j.app.webserver.JSession.class, javax.servlet.http.HttpSession.class, javax.servlet.http.HttpServletRequest.class, javax.servlet.http.HttpServletResponse.class});
	    $method_service_8 = j.service.router.JRouter.class.getMethod("service", new java.lang.Class[] {java.lang.String.class, java.lang.String.class, java.lang.String.class});
	    $method_setRouterConfig_9 = j.service.router.JRouter.class.getMethod("setRouterConfig", new java.lang.Class[] {j.service.router.RouterConfig.class});
	    $method_shutdown_10 = j.service.router.JRouter.class.getMethod("shutdown", new java.lang.Class[] {});
	    $method_startup_11 = j.service.router.JRouter.class.getMethod("startup", new java.lang.Class[] {});
	    $method_unregister_12 = j.service.router.JRouter.class.getMethod("unregister", new java.lang.Class[] {j.app.webserver.JSession.class, javax.servlet.http.HttpSession.class, javax.servlet.http.HttpServletRequest.class, javax.servlet.http.HttpServletResponse.class});
	    $method_unregister_13 = j.service.router.JRouter.class.getMethod("unregister", new java.lang.Class[] {java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class});
	} catch (java.lang.NoSuchMethodException e) {
	    throw new java.lang.NoSuchMethodError(
		"stub class initialization failed");
	}
    }
    
    // constructors
    public JRouterAbstract_Stub(java.rmi.server.RemoteRef ref) {
	super(ref);
    }
    
    // methods from remote interfaces
    
    // implementation of getAllServiceNodeAvailable(JSession, HttpSession, HttpServletRequest, HttpServletResponse)
    public void getAllServiceNodeAvailable(j.app.webserver.JSession $param_JSession_1, javax.servlet.http.HttpSession $param_HttpSession_2, javax.servlet.http.HttpServletRequest $param_HttpServletRequest_3, javax.servlet.http.HttpServletResponse $param_HttpServletResponse_4)
	throws java.rmi.RemoteException
    {
	try {
	    ref.invoke(this, $method_getAllServiceNodeAvailable_0, new java.lang.Object[] {$param_JSession_1, $param_HttpSession_2, $param_HttpServletRequest_3, $param_HttpServletResponse_4}, -2330464842705254790L);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of getAllServiceNodeAvailable(String, String, String)
    public j.service.server.ServiceBase[] getAllServiceNodeAvailable(java.lang.String $param_String_1, java.lang.String $param_String_2, java.lang.String $param_String_3)
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_getAllServiceNodeAvailable_1, new java.lang.Object[] {$param_String_1, $param_String_2, $param_String_3}, -4657842426897298789L);
	    return ((j.service.server.ServiceBase[]) $result);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of getRouterConfig()
    public j.service.router.RouterConfig getRouterConfig()
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_getRouterConfig_2, null, 4342815706425507322L);
	    return ((j.service.router.RouterConfig) $result);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of heartbeat()
    public java.lang.String heartbeat()
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_heartbeat_3, null, -819745668268156135L);
	    return ((java.lang.String) $result);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of heartbeat(JSession, HttpSession, HttpServletRequest, HttpServletResponse)
    public void heartbeat(j.app.webserver.JSession $param_JSession_1, javax.servlet.http.HttpSession $param_HttpSession_2, javax.servlet.http.HttpServletRequest $param_HttpServletRequest_3, javax.servlet.http.HttpServletResponse $param_HttpServletResponse_4)
	throws java.rmi.RemoteException
    {
	try {
	    ref.invoke(this, $method_heartbeat_4, new java.lang.Object[] {$param_JSession_1, $param_HttpSession_2, $param_HttpServletRequest_3, $param_HttpServletResponse_4}, 2655836203206862766L);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of register(JSession, HttpSession, HttpServletRequest, HttpServletResponse)
    public void register(j.app.webserver.JSession $param_JSession_1, javax.servlet.http.HttpSession $param_HttpSession_2, javax.servlet.http.HttpServletRequest $param_HttpServletRequest_3, javax.servlet.http.HttpServletResponse $param_HttpServletResponse_4)
	throws java.rmi.RemoteException
    {
	try {
	    ref.invoke(this, $method_register_5, new java.lang.Object[] {$param_JSession_1, $param_HttpSession_2, $param_HttpServletRequest_3, $param_HttpServletResponse_4}, -2683430725957629053L);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of register(String, String, String, String, String, String, String)
    public java.lang.String register(java.lang.String $param_String_1, java.lang.String $param_String_2, java.lang.String $param_String_3, java.lang.String $param_String_4, java.lang.String $param_String_5, java.lang.String $param_String_6, java.lang.String $param_String_7)
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_register_6, new java.lang.Object[] {$param_String_1, $param_String_2, $param_String_3, $param_String_4, $param_String_5, $param_String_6, $param_String_7}, -8200330151520978325L);
	    return ((java.lang.String) $result);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of service(JSession, HttpSession, HttpServletRequest, HttpServletResponse)
    public void service(j.app.webserver.JSession $param_JSession_1, javax.servlet.http.HttpSession $param_HttpSession_2, javax.servlet.http.HttpServletRequest $param_HttpServletRequest_3, javax.servlet.http.HttpServletResponse $param_HttpServletResponse_4)
	throws java.rmi.RemoteException
    {
	try {
	    ref.invoke(this, $method_service_7, new java.lang.Object[] {$param_JSession_1, $param_HttpSession_2, $param_HttpServletRequest_3, $param_HttpServletResponse_4}, -2519449223994397690L);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of service(String, String, String)
    public j.service.server.ServiceBase service(java.lang.String $param_String_1, java.lang.String $param_String_2, java.lang.String $param_String_3)
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_service_8, new java.lang.Object[] {$param_String_1, $param_String_2, $param_String_3}, 6549051120145375009L);
	    return ((j.service.server.ServiceBase) $result);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of setRouterConfig(RouterConfig)
    public void setRouterConfig(j.service.router.RouterConfig $param_RouterConfig_1)
	throws java.rmi.RemoteException
    {
	try {
	    ref.invoke(this, $method_setRouterConfig_9, new java.lang.Object[] {$param_RouterConfig_1}, -4952470805936879814L);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of shutdown()
    public void shutdown()
	throws java.rmi.RemoteException
    {
	try {
	    ref.invoke(this, $method_shutdown_10, null, -7207851917985848402L);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of startup()
    public void startup()
	throws java.rmi.RemoteException
    {
	try {
	    ref.invoke(this, $method_startup_11, null, 2982162446567935139L);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of unregister(JSession, HttpSession, HttpServletRequest, HttpServletResponse)
    public void unregister(j.app.webserver.JSession $param_JSession_1, javax.servlet.http.HttpSession $param_HttpSession_2, javax.servlet.http.HttpServletRequest $param_HttpServletRequest_3, javax.servlet.http.HttpServletResponse $param_HttpServletResponse_4)
	throws java.rmi.RemoteException
    {
	try {
	    ref.invoke(this, $method_unregister_12, new java.lang.Object[] {$param_JSession_1, $param_HttpSession_2, $param_HttpServletRequest_3, $param_HttpServletResponse_4}, 3536668348822972995L);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of unregister(String, String, String, String)
    public java.lang.String unregister(java.lang.String $param_String_1, java.lang.String $param_String_2, java.lang.String $param_String_3, java.lang.String $param_String_4)
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_unregister_13, new java.lang.Object[] {$param_String_1, $param_String_2, $param_String_3, $param_String_4}, 489609173194855872L);
	    return ((java.lang.String) $result);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
}