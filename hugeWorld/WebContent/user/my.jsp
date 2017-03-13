<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>Blue Water a Hotel Category Flat Bootstrap Responsive Web Template| Home :: w3layouts</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Blue Water Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<link href="../css/bootstrap.css" rel='stylesheet' type='text/css' />
<link href="../css/style.css" rel='stylesheet' type='text/css' />
<script src="../js/jquery-1.11.0.min.js"></script>
<link href='http://fonts.googleapis.com/css?family=Exo:100,200,300,400,500,600,700,800,900,100italic,200italic,300italic,400italic,500italic,600italic,700italic,800italic,900italic' rel='stylesheet' type='text/css'>  

<script type="text/javascript" src="../js/move-top.js"></script>
<script type="text/javascript">
			jQuery(document).ready(function($) {
				$(".scroll").click(function(event){		
					event.preventDefault();
					$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
				});
			});
		</script>
<!--start-smoth-scrolling-->
</head>
<body>
	<!--start-banner-->
	<div class="banner1" id="home">
		<div class="container">
			<div class="header">
                 <p>当前用户：${um.name}</p>
                 <p>在线用户个数:${usernum}</p>
				<p>点击次数:${userAccessNum}</p>
				<div class="menu">
                                     <a class="toggleMenu" href="#"><img src="../images/menu-icon.png" alt="" /> </a>
					<ul class="nav" id="nav">
					<li><a href="toviewname.do">主页</a></li>
                    <li><a href="blueseatoview.do">蓝海</a></li>
					<li><a href="countrytoview.do">国度</a></li>
					<li><a href="bootingtoview.do">预定</a></li>
                    <li class="active"><a href="usertoview.do"  class="active">我的</a></li>
                    <li><a href="contacttoview.do">联系</a></li>
					</ul>
                                  <!----start-top-nav-script---->
		                      <script type="text/javascript" src="../js/responsive-nav.js"></script>
					<script type="text/javascript">
					jQuery(document).ready(function($) {
						$(".scroll").click(function(event){		
							event.preventDefault();
							$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
						});
					});
					</script>
		<!----//End-top-nav-script---->
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
    
        <div class="log-in">
		<ul>
			<li><a class="play-icon popup-with-zoom-anim" href="#small-dialog">登录</a></li>
			<li><a class="play-icon popup-with-zoom-anim" href="#small-dialog1">注册</a></li>
            <li><a href="logout.do">退出</a></li>
		</ul>
	</div>
	<!---pop-up-box---->
					  <script type="text/javascript" src="../js/modernizr.custom.min.js"></script>    
					<link href="../css/popup-box.css" rel="stylesheet" type="text/css" media="all"/>
					<script src="../js/jquery.magnific-popup.js" type="text/javascript"></script>
					<!---//pop-up-box---->
				<div id="small-dialog" class="mfp-hide">
						<div class="login">
                            <form action="login.do" method="post" >
							<h3>登录</h3>
							<h4>已有账号</h4>
							<input type="text" value="用户名" onfocus="this.value = '';" name="name"/>
							<input type="password" value="Password" onfocus="this.value = '';" name="password"/>
							<input type="submit" value="登录" />
                            </form>
						</div>
					</div>
					<div id="small-dialog1" class="mfp-hide">
						<div class="signup">
                            <form  action="signin.do" method="post" enctype="multipart/form-data">
							<h3>注册</h3>
							<h4>输入详细信息</h4>
                            
				            <input type="text" class="email"value="用户名" onfocus="this.value = '';" name="tname" />
							<input type="file" name="photo"/>
                            
							<input type="password" value="password" onfocus="this.value = '';" name="tpassword"/>
							<input type="submit"  value="注册"/>
                            </form>
						</div>
					</div>	
    
   
				 <script>
						$(document).ready(function() {
						$('.popup-with-zoom-anim').magnificPopup({
							type: 'inline',
							fixedContentPos: false,
							fixedBgPos: true,
							overflowY: 'auto',
							closeBtnInside: true,
							preloader: false,
							midClick: true,
							removalDelay: 300,
							mainClass: 'my-mfp-zoom-in'
						});
																						
						});
				</script>					
    
    
    
    
	<!--end-banner-->
	<!--start-services-->
	<div class="services">
		<div class="container">
			<div class="services-main">
				<h3>用户信息</h3>
				<div class="services-top">
                    
                    <div class="col-md-4 service-left">
                    <div class="yyyy">
                    <table  class="table">
				<tbody>
					<tr>
						<th>
							用户名：
						</th>
						<td>
							${um.name}
						</td>
					</tr>
					<tr>
						<th>
							密码：
						</th>
						<td>
							${um.password}
						</td>
						
					</tr>
					<tr>
						<th>
							头像：
						</th>
						<td>
							<img class="iii" src="photoshow.do?name=${um.name }"/>
						</td>
						
					</tr>
					<tr>
						<th>
							<a class="play-icon popup-with-zoom-anim" href="#small-dialog2">修改</a>
						</th>
						<td>
							
						</td>
						
					</tr>
				</tbody>
			</table>
                    
                    <!---  <p>用户名：${um.name}</p>
                        <p> 密码：${um.password}</p>
                        <p>头像：<img src="photoshow.do?name=${um.name }"/></p>
                        <p><a class="play-icon popup-with-zoom-anim" href="#small-dialog2">修改</a></p> ---->
                       
                        <div id="small-dialog2" class="mfp-hide">
						<div class="update">
                            <form action="usertomodify.do" method="post" enctype="multipart/form-data">
                            
								<h3>修改</h3>
								<table class="ttt">
								<tr>
								<td>用户名：</td>
								<td>${um.name}</td>
								</tr>
								<tr>
									<td>密码：</td>
									<td><input type="text" value="${um.password}" onfocus="this.value = '';" name="xpassword"/></td>
								</tr>
								<tr>
								<td>头像：</td>
								<td><img class="iii" src="photoshow.do?name=${um.name } "/></td>
								<tr><td>头像修改为：</td>
								<td><input type="file" name="photo"/></td>
								</tr>
							</table>
								<input type="submit" value="确定" />
	                                </form>
						</div>
					</div>
					</div>
					</div>
					
					
					<div class="clearfix"></div>
				</div>
			</div>
		</div>
	</div>
	<!--end-services-->
	<!--start-other-->
	<div class="other">
		<div class="container">
			<div class="other-main">
				<h3>订单信息</h3>
				<div class="other-top">
                    
                    <div class="container-fluid">
	<div class="row-fluid">
		<div class="span12">
			<table class="table table-bordered">
				<thead>
					<tr class="warning">
					    <th>
							编号
						</th>
						<th>
							开始旅行
						</th>
						<th>
							结束旅行
						</th>
						<th>
							目的地
						</th>
						<th>
							人数
						</th>
						<th>
							处理
						</th>
					</tr>
				</thead>
				<tbody>
				<c:forEach  var="om" items="${requestScope.omlist}">
					<tr class="warning">
						<td>
							${om.id}
						</td>
						<td>
							${om.strdate}
						</td>
						<td>
							${om.enddate}
						</td>
						<td>
							${om.place}
						</td>
						<td>
							${om.count}
						</td>
						<td>
							<a href="orderstomodify.do?id=${om.id}">修改</a>
							
							<a href="orderstodelete.do?id=${om.id}">删除</a>
						</td>
					</tr>
				</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</div>


					
					<div class="clearfix"></div>
				</div>
			</div>
		</div>
	</div>
	<!--end-other-->
	<!--start-list-->
	<div class="list">
		<div class="container">
			<div class="list-main">
				<h3>愿望清单</h3>
			</div>
			<div class="list-top">
 
	
                <div class="container-fluid">
	<div class="row-fluid">
		<div class="span12">
			<table class="table table-bordered">
				<thead>
					<tr class="info">
						<th>
							编号
						</th>
						<th>
							目的地
						</th>
						<th>
							预期价格
						</th>
						<th>
							人数
						</th>
						<th>
							处理
						</th>
					</tr>
				</thead>
				<tbody>
				<c:forEach  var="dm" items="${requestScope.dmlist}">
					<tr class="info">
						<td>
							${dm.did}
						</td>
						<td>
							${dm.wantto}
						</td>
						<td>
							${dm.price}
						</td>
						<td>
							${dm.num}
						</td>
						<td>
							<a href="dreamtomodify.do?id=${dm.did}">修改</a>
							<a href="dreamtodelete.do?id=${dm.did}">删除</a>
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</div>
                
			</div>
		</div>
	</div>
	
	<div class="other">
		<div class="container">
			<div class="other-main">
				<h3>订阅详情</h3>
				<div class="other-top">
                    <div class="wwww">
                    <table  class="table">
				<tbody>
					<tr>
						<th>
							邮箱地址：
						</th>
						<td>
							${sm.mail}
						</td>
					</tr>
					<tr>
						<th>
							订阅情况：
						</th>
						<td>
							${sm.ding}
						</td>
						
					</tr>
					<tr>
						<th>
							<a class="play-icon popup-with-zoom-anim" href="#small-dialog3">修改</a>
							<div id="small-dialog3" class="mfp-hide">
						<div class="update">
                            <form action="subsmodify.do" method="post">
                            
								<h3>修改</h3>
								<table class="ttt">
								<tr>
								<td>邮箱地址：</td>
								<td><input type="text" value="${sm.mail}" onfocus="this.value = '';" name="mail"/></td>
								</tr>
								
							</table>
								<input type="submit" value="确定" />
	                                </form>
						</div>
						
					</div>
						<a class="play-icon popup-with-zoom-anim" href="#small-dialog4">删除</a>	
						<div id="small-dialog4" class="mfp-hide">
						<div class="update">
                            <form action="subsdelete.do" method="post">
                            
								<h3>删除</h3>
								<table class="ttt">
								<tr>
								<td>邮箱地址：</td>
								<td><input type="text" value="${sm.mail}" onfocus="this.value = '';" name="mail"/></td>
								</tr>
								
							</table>
								<input type="submit" value="确定" />
	                                </form>
						</div>
						
					</div>
						</th>
						<td>
							
						</td>
						
					</tr>
					
				</tbody>
				
			</table>
           </div> 
					
					<div class="clearfix"></div>
				</div>
			</div>
		</div>
	</div>
    
    
    
    
    
    
    <div class="list">
		<div class="container">
			<div class="list-main">
				<h3>联系详情</h3>
			</div>
			<div class="list-top">
 
	
  <div class="container-fluid">
	<div class="row-fluid">
		<div class="span12">
			<table class="table table-bordered">
				<thead>
					<tr class="warning">
					    <th>
							编号
						</th>
						<th>
							发件地址
						</th>
						<th>
							主题
						</th>
					</tr>
				</thead>
				<tbody>
				<c:forEach  var="cm" items="${requestScope.cmlist}">
					<tr class="warning">
						<td>
							${cm.cid}
						</td>
						<td>
							${cm.email}
						</td>
						<td>
							${cm.subject}
						</td>
					</tr>
				</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</div>


                
			</div>
		</div>
	</div>
	
	
	
	<!--end-list-->
	<!--start-footer-->
	<div class="footer">
		<div class="container">
			<div class="footer-main">
				<div class="col-md-5 footer-left">
					<h4>随我来</h4>
					<ul>
						<li><a href="#"><span class="twt"> </span></a></li>
						<li><a href="#"><span class="fb"> </span></a></li>
						<li><a href="#"><span class="p"> </span></a></li>
						<li><a href="#"><span class="yt"> </span></a></li>
						<li><a href="#"><span class="in"> </span></a></li>
					</ul>
					<h4>地址</h4>
					<h5>大连，理工，大学，城市，学院</h5>
					<p>邮件 <a href="mailto:info@example.com"> 123456789@163.com</a></p>
					<p>致电 123 456 789</p>
				</div>
				<div class="col-md-7 footer-right">
					<h4>订阅更新</h4>
					<span>
					<form action="subsadd.do" method="post">
						<input type="text"  value="Enter email" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Enter email';}" name="mail">
						<input type="submit" value="SUBSCRIBE">
					</form>
					</span>
					<ul>
						<li><a href="toviewname.do">主页</a></li>
						<li><a href="blueseatoview.do">蓝海</a></li>
                        <li><a href="countrytoview.do">国度</a></li>
						<li><a href="bootingtoview.do">预定</a></li>
						<li><a href="usertoview.do">我的</a></li>
                        <li><a href="contacttoview.do">联系</a></li>
						<li><a class="play-icon popup-with-zoom-anim" href="#small-dialog">登录</a></li>
						<li><a class="play-icon popup-with-zoom-anim" href="#small-dialog1">注册</a></li>
					</ul>
				</div>
				<div class="clearfix"> </div>
			</div>
			<div class="footer-text">
				<p>制作 <a href="#"> 赵明明</a></p>
			</div>
		</div>
		<a href="#home" id="toTop" class="scroll" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
	</div>
	<!--end-footer-->
</body>
</html>