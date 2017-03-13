<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>预定</title>
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
					<li class="active"><a href="bootingtoview.do" class="active">预定</a></li>
                    <li><a href="usertoview.do">我的</a></li>
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
	<!--end-banner-->
	<!--start-booking-->
	<div class="booking">
		<div class="container">
			<div class="booking-main">
				<h3>预定</h3>
				<div class="booking-top">
					<div class="col-md-4 booking-top-left">
						<h4>立即预定</h4>
						<div class="booking-form">
                            <form action="addorders.do" method="post" >
							<div class="b_room">
								<div class="booking_room">
									<div class="reservation">
									
										<ul>		
											 <li  class="span1_of_1 left">
											 	<div class="book-text">
												 	<h5>开始旅行:</h5>
												 </div>
												 <div class="book_date">
													 
													 <input class="date" id="datepicker" type="text" value="" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '';}" required="" name="strdate">
													
												 </div>
												 <div class="clearfix"></div>					
											 </li>
											 <li  class="span1_of_1 left">
												 <div class="book-text">
												 	<h5>结束旅行:</h5>
												 </div>
												 <div class="book_date">
												 
													<input class="date" id="datepicker1" type="text" value="" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '';}" required="" name="enddate">
												
												 </div>
												 <div class="clearfix"></div>		
											 </li>
                                             <li  class="span1_of_1 left">
												  <div class="book-text">
												 	<h5>目的地:</h5>
												 </div>
												 <div class="book_date">
													 
														<input type="text" placeholder="" required="" name="place">
													 
												 </div>
												 <div class="clearfix"></div>						
											 </li>
											  <li class="span1_of_1">
												 <div class="book-text">
												 	<h5>人数</h5>
												 </div>
												 <!----------start section_room----------->
												 <div class="book_date">
													  <select id="country" onchange="change_country(this.value)" class="frm-field required" name="count">
															<option value="null"></option>
															<option value="1">1</option>         
															<option value="2">2</option>
															<option value="3">3</option>
															<option value="4">4</option>
													  </select>
												 </div>
												 <div class="clearfix"></div>	
											 </li>
											
											 <div class="clearfix">
											 </div>
										</ul>
										
									 </div>
								</div>
								<div class="clearfix"></div>
							</div>
                               
					<!---->
					<div class="b-btn">
                        <input class="b1" type="submit" value="预定"/>
					</div>
                   </form>
     
				</div>  
                        
                        <div style="height:60px"></div>
                        <h4>愿望清单</h4>
						<div class="booking-form">
                            <form action="adddream.do" method="post">
							<div class="b_room">
								<div class="booking_room">
									<div class="reservation">
										<ul>		
											 
											
                                             <li  class="span1_of_1 left">
												  <div class="book-text">
												 	<h5>目的地:</h5>
												 </div>
												 <div class="book_date">
													
														<input type="text" placeholder="" required="" name="wantto">
													
												 </div>
												 <div class="clearfix"></div>						
											 </li>
                                            <li  class="span1_of_1 left">
												  <div class="book-text">
												 	<h5>预期价格:</h5>
												 </div>
												 <div class="book_date">
													
														<input type="text" placeholder="" required="" name="price">
													
												 </div>
												 <div class="clearfix"></div>						
											 </li>
											  <li class="span1_of_1">
												 <div class="book-text">
												 	<h5>人数</h5>
												 </div>
												 <!----------start section_room----------->
												 <div class="book_date">
													  <select id="country" onchange="change_country(this.value)" class="frm-field required" name="num">
															<option value="null"></option>
															<option value="1">1</option>         
															<option value="2">2</option>
															<option value="3">3</option>
															<option value="4">4</option>
													  </select>
												 </div>
												 <div class="clearfix"></div>	
											 </li>
											
											 <div class="clearfix"></div>
										</ul>
									 </div>
								</div>
								<div class="clearfix"></div>
							</div>
					<!---->
					<div class="b-btn">
                        <input class="b1" type="submit" value="提交"/>
					</div>
                  </form>
     
				</div>                  
				</div>
					</div>
					<div class="col-md-8 booking-top-right">
						<h4>特价区</h4>
						<div class="book-bottom">
							<div class="col-md-5 book-bottom-left">
								<img src="../images/b-1.jpg" alt="">
							</div>
							<div class="col-md-7 book-bottom-right">
								<h6>意大利，米兰，双飞五日游</h6>
								<p>温哥华（City of Vancouver）是加拿大不列颠哥伦比亚省低陆平原地区一沿岸城市。2011年人口普查，温哥华市内有60万人口，而大温华人口则达到230万，是加拿大第三大都会，加拿大西部第一大城市。</p>
							</div>
							<div class="clearfix"></div>
						</div>
						<div class="book-bottom-one">
							<div class="col-md-5 book-bottom-left">
								<img src="../images/b-2.jpg" alt="">
							</div>
							<div class="col-md-7 book-bottom-right">
								<h6>温哥华，经济三日游</h6>
								<p>温哥华（City of Vancouver）是加拿大不列颠哥伦比亚省低陆平原地区一沿岸城市。2011年人口普查，温哥华市内有60万人口，而大温华人口则达到230万，是加拿大第三大都会，加拿大西部第一大城市。</p>
							</div>
							<div class="clearfix"></div>
						</div>
					
                        <div class="book-bottom">
							<div class="col-md-5 book-bottom-left">
								<img src="../images/b-1.jpg" alt="">
							</div>
							<div class="col-md-7 book-bottom-right">
								<h6>布宜诺斯艾利斯，豪华双人四飞，十日游</h6>
								<p>温哥华（City of Vancouver）是加拿大不列颠哥伦比亚省低陆平原地区一沿岸城市。2011年人口普查，温哥华市内有60万人口，而大温华人口则达到230万，是加拿大第三大都会，加拿大西部第一大城市。</p>
							</div>
							<div class="clearfix"></div>
						</div>
						<div class="book-bottom-one">
							<div class="col-md-5 book-bottom-left">
								<img src="../images/b-2.jpg" alt="">
							</div>
							<div class="col-md-7 book-bottom-right">
								<h6>霍林郭勒，两日游</h6>
								<p>温哥华（City of Vancouver）是加拿大不列颠哥伦比亚省低陆平原地区一沿岸城市。2011年人口普查，温哥华市内有60万人口，而大温华人口则达到230万，是加拿大第三大都会，加拿大西部第一大城市。</p>
							</div>
							<div class="clearfix"></div>
						</div>
                        
                        
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
		</div>
	</div>
	<!--end-booking-->
	<!---strat-date-piker---->
					<link rel="stylesheet" href="../css/jquery-ui.css" />
					<script src="../js/jquery-ui.js"></script>
							  <script>
									  $(function() {
										$( "#datepicker,#datepicker1" ).datepicker();
									  });
							  </script>
					<!---/End-date-piker---->
					<link type="text/css" rel="stylesheet" href="../css/JFGrid.css" />
					<link type="text/css" rel="stylesheet" href="../css/JFFormStyle-1.css" />
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