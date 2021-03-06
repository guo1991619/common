package com.jokers.common.http;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * <p>IpUtil class.</p>
 *
 * @author yuton
 * @version 1.0
 *  ip获取
 * @since 2017/2/8 17:35
 */
public class IpUtil {

    private static final String UNKNOWN = "unknown";

    /**
     * 获取http请求的真实IP地址
     *
     * @param request {@link javax.servlet.http.HttpServletRequest}
     * @return String
     */
    public static String getIPAddress(HttpServletRequest request) {
        if (null == request) {
            return null;
        }
        String ip = request.getHeader("X-Forwarded-For");
        if (null == ip || ip.length() == 0 || UNKNOWN.equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (null == ip || ip.length() == 0 || UNKNOWN.equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (null == ip || ip.length() == 0 || UNKNOWN.equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_CLIENT_IP");
        }
        if (null == ip || ip.length() == 0 || UNKNOWN.equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (null == ip || ip.length() == 0 || UNKNOWN.equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }
}
