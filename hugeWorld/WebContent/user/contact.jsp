<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>联系我们</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Blue Water Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<link href="../css/bootstrap.css" rel='stylesheet' type='text/css' />
<link href="../css/style.css" rel='stylesheet' type='text/css' />
<script src="../js/jquery-1.11.0.min.js"></script>
<link href='http://fonts.googleapis.com/css?family=Exo:100,200,300,400,500,600,700,800,900,100italic,200italic,300italic,400italic,500italic,600italic,700italic,800italic,900italic' rel='stylesheet' type='text/css'>  
<!---- start-smoth-scrolling---->
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
                    <li><a href="usertoview.do">我的</a></li>
					<li class="active"><a href="contacttoview.do" class="active">联系</a></li>
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
	<!--end-banner-->
	<!--start-contact-->
	<div class="contact">
		<div class="container">
			<div class="contact-main">
				<h3>怎么找到我</h3>
				<div class="contact-top">
					<iframe src="http://f.amap.com/dWGD_0CF25Qy" frameborder="0" style="border:0"></iframe>
					<p> 大连理工大学城市学院经国家教育部批准成立于2003年3月，是大连理工大学举办的东北首家按新机制、新模式设立的新型普通本科院校。学院地处中国十大最具经济活力的滨海城市——大连，学院各类办学设施齐全，为学生创造了良好的学习和生活条件。
</p>
					<div class="contact-one">
						<div class="col-md-4 contact-left">
							<div class="c-left">
								<span class="adrs"> </span>
							</div>
							<div class="c-right">
								<h5>学校名称,<span>大连 理工 大学 城市 学院.</span></h5>
							</div>
							<div class="clearfix"></div>
						</div>
						<div class="col-md-4 contact-left">
							<div class="c-left">
								<span class="ph"> </span>
							</div>
							<div class="c-right">
							<p>电话: +1 234 567 98
								<span>传真: +1 234 567 98</span>
							</p>
							</div>
							<div class="clearfix"></div>
						</div>
						<div class="col-md-4 contact-left">
							<div class="c-left">
								<span class="mail"> </span>
							</div>
							<div class="c-right">
								<p><a href="mailto:info@example.com">邮件123456789@163.com</a></p>
							</div>
							<div class="clearfix"></div>
						</div>
						<div class="clearfix"></div>
					</div>
				</div>
				<div class="contact-bottom">
					<h3>联系表</h3>
					<form action="contactadd.do" method="post">
					<div class="contact-text">
						<input type="text" value="主题" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '主题';}" name="subject"/>
						<input type="text" value="邮箱" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '邮箱';}" name="email"/>
						<textarea value="内容:" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '内容';}" name="context">内容..</textarea>
						<div class="contact-but">
							<input type="submit" />
						</div>
					</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<!--end-contact-->
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
					<p>致电 +123 456 789</p>
				</div>
				<div class="col-md-7 footer-right">
					<h4>订阅更新</h4>
					<span>
						<input type="text"  value="Enter email" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Enter email';}">
						<input type="submit" value="SUBSCRIBE">
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