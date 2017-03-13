<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />


<link href="../css/bootstrap.css" rel='stylesheet' type='text/css' />
<link href="../css/style.css" rel='stylesheet' type='text/css' />
<script src="../js/jquery-1.11.0.min.js"></script>
<link href='http://fonts.googleapis.com/css?family=Exo:100,200,300,400,500,600,700,800,900,100italic,200italic,300italic,400italic,500italic,600italic,700italic,800italic,900italic' rel='stylesheet' type='text/css'>  


  <script type="text/javascript" src="../js/modernizr.custom.min.js"></script>    
					<link href="../css/popup-box.css" rel="stylesheet" type="text/css" media="all"/>
					<script src="../js/jquery.magnific-popup.js" type="text/javascript"></script>
<title>Insert title here</title>
<fmt:setBundle basename="com.oracle.erp.stock.info.Contect"/>
</head>
<body>
 <div id="small-dialog3">
						<div class="update">
                            <form action="ordersmodify.do" method="post" >
                            
								<h3><fmt:message key="modify"/></h3>
								<input type="hidden" name="id" value="${om.id}" />
								<table class="ttt">
								<tr>
								<td><fmt:message key="str"/>：</td>
								<td><input type="text" class="date"  id="datepicker"  value="${om.strdate}" onfocus="this.value = '';"  onblur="if (this.value == '') {this.value = '';}" name="strdate"/></td>
								</tr>
								<tr>
									<td><fmt:message key="end"/>：</td>
									<td><input type="text" class="date"  id="datepicker1"  value="${om.enddate}" onfocus="this.value = '';"  onblur="if (this.value == '') {this.value = '';}" name="enddate"/></td>
								</tr>
								<tr>
								<td><fmt:message key="place"/>：</td>
								<td><input type="text" value="${om.place}" onfocus="this.value = '';" name="place"/> </td>
								<tr><td><fmt:message key="num"/>：</td>
								<td><input type="text" value="${om.count}" onfocus="this.value = '';" name="count"/></td>
								</tr>
							</table>
								<input type="submit" value="<fmt:message key="ok"/>" />
	                                </form>
						</div>
					</div>
<!---strat-date-piker---->
					<link rel="stylesheet" href="../css/jquery-ui.css" />
					<script src="../js/jquery-ui.js"></script>
							  <script>
									  $(function() {
										$( "#datepicker,#datepicker1" ).datepicker();
									  });
							  </script>
					<!---/End-date-piker---->
					
					<script type="text/javascript" src="../js/JFCore.js"></script>
					<script type="text/javascript" src="../js/JFForms.js"></script>
					<!-- Set here the key for your domain in order to hide the watermark on the web server -->
					<script type="text/javascript">
						(function() {
							JC.init({
								domainKey: ''
							});
						})();
					</script>
</body>
</html>