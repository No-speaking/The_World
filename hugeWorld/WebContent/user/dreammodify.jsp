<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
</head>
<body>
 <div id="small-dialog3">
						<div class="update">
                            <form action="dreammodify.do" method="post" >
                            
								<h3>修改</h3>
								<input type="hidden" name="did" value="${dm.did}" />
								<table class="ttt">
								<tr>
								<td>目的地：</td>
								<td><input type="text" value="${dm.wantto}" onfocus="this.value = '';"  onblur="if (this.value == '') {this.value = '';}" name="wantto"/></td>
								</tr>
								<tr>
									<td>预期价格：</td>
									<td><input type="text" value="${dm.price}" onfocus="this.value = '';"  onblur="if (this.value == '') {this.value = '';}" name="price"/></td>
								</tr>
								<tr>
									<td>人数：</td>
									<td><input type="text" value="${dm.num}" onfocus="this.value = '';" name="num"/> </td>
								</tr>
							</table>
								<input type="submit" value="确定" />
	                                </form>
						</div>
					</div>

</body>
</html>