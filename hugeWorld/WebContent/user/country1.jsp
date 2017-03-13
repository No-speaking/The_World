<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>国度</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Blue Water Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<link href="../css/bootstrap.css" rel='stylesheet' type='text/css' />
<link href="../css/style.css" rel='stylesheet' type='text/css' />
 <link href="../vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
    <link href='https://fonts.googleapis.com/css?family=Kaushan+Script' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700' rel='stylesheet' type='text/css'>

    <!-- Theme CSS -->
    <link href="../css/agency.min.css" rel="stylesheet">
    


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
					<li class="active"><a href="countrytoview.do" class="active">国度</a></li>
					<li><a href="bootingtoview.do">预定</a></li>
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
	<!--start-about-->
	<div class="about">
		<div class="container">
			<div class="about-top">
				<h3>国度</h3>
				<div class="about-main">
					<div class="col-md-8 about-top-left">
						<h4>墨西哥</h4>
						<div class="abt-top">
								<div class="col-md-5 abt-left">
									<img src="../images/abt-1.jpg" src="">
								</div>
								<div class="col-md-7 abt-right">
									<h5>圣路易斯波托西</h5>
									<p> 温哥华（City of Vancouver）是加拿大不列颠哥伦比亚省低陆平原地区一沿岸城市。2011年人口普查，温哥华市内有60万人口，而大温华人口则达到230万，是加拿大第三大都会，加拿大西部第一大城市。温哥华南部是美国西北部第一大城市西雅图。
温哥华电影制片业发达，是北美洲继洛杉矶、纽约之后的第三大制片中心，素有北方好莱坞之称。温哥华近年经常在各项世界最佳居住城</p>
								</div>
								<div class="clearfix"></div>
						</div>
						<div class="abt-top">
							<div class="col-md-5 abt-left">
								<img src="../images/abt-2.jpg" src="">
							</div>
							<div class="col-md-7 abt-right">
								<h5>卡门城</h5>
								<p>加拿大（英语/法语：Canada），位于北美洲最北端，英联邦国家之一，素有“枫叶之国”的美誉，首都是渥太华。加拿大西抵太平洋，东迄大西洋，北至北冰洋，东北部和丹麦领地格陵兰岛相望，东部和法属圣皮埃尔和密克隆群岛相望，南方与美国本土接壤，西北方与美国阿拉斯加州为邻。领土面积为998万平方千米，位居世界第二。</p>
							</div>
							<div class="clearfix"></div>
						</div>
					</div>
					<div class="col-md-4 about-top-right">
						<h4>清单</h4>
						<ul>
							<li><a href="countrytoview.do">加拿大</a></li>
							<li><a href="countryonetoview.do">墨西哥</a></li>
							<li><a href="countrytwotoview.do">澳大利亚</a></li>
							<li><a href="countrythreetoview.do">希腊</a></li>
							<li><a href="countryfourtoview.do">法国</a></li>
							<li><a href="countryfivetoview.do">意大利</a></li>
							<li><a href="countrysixtoview.do">挪威</a></li>
							<li><a href="countryseventoview.do">马达加斯加</a></li>
							<li><a href="countryeighttoview.do">瑞典</a></li>
							<li><a href="countryninetoview.do">丹麦</a></li>
							<li><a href="countrytentoview.do">美国</a></li>
							<li><a href="countryelevtoview.do">西班牙</a></li>
							<li><a href="countrytweltoview.do">里约</a></li>
							<li><a href="countrythrtentoview.do">泰国</a></li>
							<li><a href="countryfortentoview.do">波罗的海</a></li>
						</ul>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
		</div>
	</div>
	<!--end-about-->
	<!--start-team-->
			 <section id="portfolio" class="bg-light-gray">
        <div class="container">
            <div class="row">
            
                <div class="col-lg-12 text-center staff-top">
                    <h3>梦的国度</h3>
                    </br>
          <h4 class="section-subheading text-muted">过目难忘</h4>
                </br>
                </div>
            </div>
            <div class="row">
                <div class="col-md-4 col-sm-6 portfolio-item">
                    <a href="#portfolioModal1" class="portfolio-link" data-toggle="modal">
                        <div class="portfolio-hover">
                            <div class="portfolio-hover-content">
                                <i class="fa fa-plus fa-3x"></i>
                            </div>
                        </div>
                        <img src="../img/portfolio/roundicons.png" class="img-responsive" alt="">
                    </a>
                    <div class="portfolio-caption">
                        <h4>Round Icons</h4>
                        <p class="text-muted">Graphic Design</p>
                    </div>
                </div>
                <div class="col-md-4 col-sm-6 portfolio-item">
                    <a href="#portfolioModal2" class="portfolio-link" data-toggle="modal">
                        <div class="portfolio-hover">
                            <div class="portfolio-hover-content">
                                <i class="fa fa-plus fa-3x"></i>
                            </div>
                        </div>
                        <img src="../img/portfolio/startup-framework.png" class="img-responsive" alt="">
                    </a>
                    <div class="portfolio-caption">
                        <h4>Startup Framework</h4>
                        <p class="text-muted">Website Design</p>
                    </div>
                </div>
                <div class="col-md-4 col-sm-6 portfolio-item">
                    <a href="#portfolioModal3" class="portfolio-link" data-toggle="modal">
                        <div class="portfolio-hover">
                            <div class="portfolio-hover-content">
                                <i class="fa fa-plus fa-3x"></i>
                            </div>
                        </div>
                        <img src="../img/portfolio/treehouse.png" class="img-responsive" alt="">
                    </a>
                    <div class="portfolio-caption">
                        <h4>Treehouse</h4>
                        <p class="text-muted">Website Design</p>
                    </div>
                </div>
                <div class="col-md-4 col-sm-6 portfolio-item">
                    <a href="#portfolioModal4" class="portfolio-link" data-toggle="modal">
                        <div class="portfolio-hover">
                            <div class="portfolio-hover-content">
                                <i class="fa fa-plus fa-3x"></i>
                            </div>
                        </div>
                        <img src="../img/portfolio/golden.png" class="img-responsive" alt="">
                    </a>
                    <div class="portfolio-caption">
                        <h4>Golden</h4>
                        <p class="text-muted">Website Design</p>
                    </div>
                </div>
                <div class="col-md-4 col-sm-6 portfolio-item">
                    <a href="#portfolioModal5" class="portfolio-link" data-toggle="modal">
                        <div class="portfolio-hover">
                            <div class="portfolio-hover-content">
                                <i class="fa fa-plus fa-3x"></i>
                            </div>
                        </div>
                        <img src="../img/portfolio/escape.png" class="img-responsive" alt="">
                    </a>
                    <div class="portfolio-caption">
                        <h4>Escape</h4>
                        <p class="text-muted">Website Design</p>
                    </div>
                </div>
                <div class="col-md-4 col-sm-6 portfolio-item">
                    <a href="#portfolioModal6" class="portfolio-link" data-toggle="modal">
                        <div class="portfolio-hover">
                            <div class="portfolio-hover-content">
                                <i class="fa fa-plus fa-3x"></i>
                            </div>
                        </div>
                        <img src="../img/portfolio/dreams.png" class="img-responsive" alt="">
                    </a>
                    <div class="portfolio-caption">
                        <h4>Dreams</h4>
                        <p class="text-muted">Website Design</p>
                    </div>
                </div>
            </div>
        </div>
    </section>
        
        
          <!-- Portfolio Modals -->
    <!-- Use the modals below to showcase details about your portfolio projects! -->

    <!-- Portfolio Modal 1 -->
    <div class="portfolio-modal modal fade" id="portfolioModal1" tabindex="-1" role="dialog" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="close-modal" data-dismiss="modal">
                    <div class="lr">
                        <div class="rl">
                        </div>
                    </div>
                </div>
                <div class="container">
                    <div class="row">
                        <div class="col-lg-8 col-lg-offset-2">
                            <div class="modal-body">
                                <!-- Project Details Go Here -->
                                <h2>Project Name</h2>
                                <p class="item-intro text-muted">Lorem ipsum dolor sit amet consectetur.</p>
                                <img class="img-responsive img-centered" src="../img/portfolio/roundicons-free.png" alt="">
                                <p>Use this area to describe your project. Lorem ipsum dolor sit amet, consectetur adipisicing elit. Est blanditiis dolorem culpa incidunt minus dignissimos deserunt repellat aperiam quasi sunt officia expedita beatae cupiditate, maiores repudiandae, nostrum, reiciendis facere nemo!</p>
                                <p>
                                    <strong>Want these icons in this portfolio item sample?</strong>You can download 60 of them for free, courtesy of <a href="https://getdpd.com/cart/hoplink/18076?referrer=bvbo4kax5k8ogc">RoundIcons.com</a>, or you can purchase the 1500 icon set <a href="https://getdpd.com/cart/hoplink/18076?referrer=bvbo4kax5k8ogc">here</a>.</p>
                                <ul class="list-inline">
                                    <li>Date: July 2014</li>
                                    <li>Client: Round Icons</li>
                                    <li>Category: Graphic Design</li>
                                </ul>
                                <button type="button" class="btn btn-primary" data-dismiss="modal"><i class="fa fa-times"></i> Close Project</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Portfolio Modal 2 -->
    <div class="portfolio-modal modal fade" id="portfolioModal2" tabindex="-1" role="dialog" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="close-modal" data-dismiss="modal">
                    <div class="lr">
                        <div class="rl">
                        </div>
                    </div>
                </div>
                <div class="container">
                    <div class="row">
                        <div class="col-lg-8 col-lg-offset-2">
                            <div class="modal-body">
                                <h2>Project Heading</h2>
                                <p class="item-intro text-muted">Lorem ipsum dolor sit amet consectetur.</p>
                                <img class="img-responsive img-centered" src="../img/portfolio/startup-framework-preview.png" alt="">
                                <p><a href="http://designmodo.com/startup/?u=787">Startup Framework</a> is a website builder for professionals. Startup Framework contains components and complex blocks (PSD+HTML Bootstrap themes and templates) which can easily be integrated into almost any design. All of these components are made in the same style, and can easily be integrated into projects, allowing you to create hundreds of solutions for your future projects.</p>
                                <p>You can preview Startup Framework <a href="http://designmodo.com/startup/?u=787">here</a>.</p>
                                <button type="button" class="btn btn-primary" data-dismiss="modal"><i class="fa fa-times"></i> Close Project</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Portfolio Modal 3 -->
    <div class="portfolio-modal modal fade" id="portfolioModal3" tabindex="-1" role="dialog" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="close-modal" data-dismiss="modal">
                    <div class="lr">
                        <div class="rl">
                        </div>
                    </div>
                </div>
                <div class="container">
                    <div class="row">
                        <div class="col-lg-8 col-lg-offset-2">
                            <div class="modal-body">
                                <!-- Project Details Go Here -->
                                <h2>Project Name</h2>
                                <p class="item-intro text-muted">Lorem ipsum dolor sit amet consectetur.</p>
                                <img class="img-responsive img-centered" src="../img/portfolio/treehouse-preview.png" alt="">
                                <p>Treehouse is a free PSD web template built by <a href="https://www.behance.net/MathavanJaya">Mathavan Jaya</a>. This is bright and spacious design perfect for people or startup companies looking to showcase their apps or other projects.</p>
                                <p>You can download the PSD template in this portfolio sample item at <a href="http://freebiesxpress.com/gallery/treehouse-free-psd-web-template/">FreebiesXpress.com</a>.</p>
                                <button type="button" class="btn btn-primary" data-dismiss="modal"><i class="fa fa-times"></i> Close Project</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Portfolio Modal 4 -->
    <div class="portfolio-modal modal fade" id="portfolioModal4" tabindex="-1" role="dialog" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="close-modal" data-dismiss="modal">
                    <div class="lr">
                        <div class="rl">
                        </div>
                    </div>
                </div>
                <div class="container">
                    <div class="row">
                        <div class="col-lg-8 col-lg-offset-2">
                            <div class="modal-body">
                                <!-- Project Details Go Here -->
                                <h2>Project Name</h2>
                                <p class="item-intro text-muted">Lorem ipsum dolor sit amet consectetur.</p>
                                <img class="img-responsive img-centered" src="../img/portfolio/golden-preview.png" alt="">
                                <p>Start Bootstrap's Agency theme is based on Golden, a free PSD website template built by <a href="https://www.behance.net/MathavanJaya">Mathavan Jaya</a>. Golden is a modern and clean one page web template that was made exclusively for Best PSD Freebies. This template has a great portfolio, timeline, and meet your team sections that can be easily modified to fit your needs.</p>
                                <p>You can download the PSD template in this portfolio sample item at <a href="http://freebiesxpress.com/gallery/golden-free-one-page-web-template/">FreebiesXpress.com</a>.</p>
                                <button type="button" class="btn btn-primary" data-dismiss="modal"><i class="fa fa-times"></i> Close Project</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
 <!-- Portfolio Modal 5 -->
    <div class="portfolio-modal modal fade" id="portfolioModal5" tabindex="-1" role="dialog" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="close-modal" data-dismiss="modal">
                    <div class="lr">
                        <div class="rl">
                        </div>
                    </div>
                </div>
                <div class="container">
                    <div class="row">
                        <div class="col-lg-8 col-lg-offset-2">
                            <div class="modal-body">
                                <!-- Project Details Go Here -->
                                <h2>Project Name</h2>
                                <p class="item-intro text-muted">Lorem ipsum dolor sit amet consectetur.</p>
                                <img class="img-responsive img-centered" src="../img/portfolio/escape-preview.png" alt="">
                                <p>Escape is a free PSD web template built by <a href="https://www.behance.net/MathavanJaya">Mathavan Jaya</a>. Escape is a one page web template that was designed with agencies in mind. This template is ideal for those looking for a simple one page solution to describe your business and offer your services.</p>
                                <p>You can download the PSD template in this portfolio sample item at <a href="http://freebiesxpress.com/gallery/escape-one-page-psd-web-template/">FreebiesXpress.com</a>.</p>
                                <button type="button" class="btn btn-primary" data-dismiss="modal"><i class="fa fa-times"></i> Close Project</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Portfolio Modal 6 -->
    <div class="portfolio-modal modal fade" id="portfolioModal6" tabindex="-1" role="dialog" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="close-modal" data-dismiss="modal">
                    <div class="lr">
                        <div class="rl">
                        </div>
                    </div>
                </div>
                <div class="container">
                    <div class="row">
                        <div class="col-lg-8 col-lg-offset-2">
                            <div class="modal-body">
                                <!-- Project Details Go Here -->
                                <h2>Project Name</h2>
                                <p class="item-intro text-muted">Lorem ipsum dolor sit amet consectetur.</p>
                                <img class="img-responsive img-centered" src="../img/portfolio/dreams-preview.png" alt="">
                                <p>Dreams is a free PSD web template built by <a href="https://www.behance.net/MathavanJaya">Mathavan Jaya</a>. Dreams is a modern one page web template designed for almost any purpose. It’s a beautiful template that’s designed with the Bootstrap framework in mind.</p>
                                <p>You can download the PSD template in this portfolio sample item at <a href="http://freebiesxpress.com/gallery/dreams-free-one-page-web-template/">FreebiesXpress.com</a>.</p>
                                <button type="button" class="btn btn-primary" data-dismiss="modal"><i class="fa fa-times"></i> Close Project</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Bootstrap Core JavaScript -->
    <script src="../vendor/bootstrap/js/bootstrap.min.js"></script>
	<!--end-team-->
	<!--start-advantage-->
	<div class="advantage">
		<div class="container">
			<div class="advantage-main">
				<h3>攻略</h3>
				<div class="advantage-top">
					<div class="col-md-4 adv-left">
						<div class="a-left">
							<h4>1.</h4> 
						</div>
						<div class="a-right">
							<h4>墨尔本 帕劳水母湖</h4>
							<p>位于帕劳群岛其中一座岩岛埃尔·马尔克，是在大约1.2万年前形成的，当时地壳隆起致使这座岛屿高出海平面，海水则被其中部下陷处捕获。 水母湖内生活着数百万只水母，它们是藻类的宿主，通过与藻类形成的共生关系生存。在大约每10年出现一次的厄尔尼诺现象影响下，水母湖温度升高，致使水母居民大面积死亡，但这些生命力顽强的动物经常能够实现数量大反弹。</p>
						</div>
						<div class="clearfix"> </div>
					</div>
					<div class="col-md-4 adv-left">
						<div class="a-left">
							<h4>2.</h4>
						</div>
						<div class="a-right">
							<h4>大连 棒棰岛</h4>
							<p>位于帕劳群岛其中一座岩岛埃尔·马尔克，是在大约1.2万年前形成的，当时地壳隆起致使这座岛屿高出海平面，海水则被其中部下陷处捕获。 水母湖内生活着数百万只水母，它们是藻类的宿主，通过与藻类形成的共生关系生存。在大约每10年出现一次的厄尔尼诺现象影响下，水母湖温度升高，致使水母居民大面积死亡，但这些生命力顽强的动物经常能够实现数量大反弹。</p>
						</div>
						<div class="clearfix"> </div>
					</div>
					<div class="col-md-4 adv-left">
						<div class="a-left">
							<h4>3.</h4>
						</div>
						<div class="a-right">
							<h4>希腊 扎金索斯岛 沉船湾</h4>
							<p>位于帕劳群岛其中一座岩岛埃尔·马尔克，是在大约1.2万年前形成的，当时地壳隆起致使这座岛屿高出海平面，海水则被其中部下陷处捕获。 水母湖内生活着数百万只水母，它们是藻类的宿主，通过与藻类形成的共生关系生存。在大约每10年出现一次的厄尔尼诺现象影响下，水母湖温度升高，致使水母居民大面积死亡，但这些生命力顽强的动物经常能够实现数量大反弹。</p>
						</div>
						<div class="clearfix"> </div>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="advantage-bottom">
					<div class="col-md-4 adv-left">
						<div class="a-left">
							<h4>4.</h4>
						</div>
						<div class="a-right">
							<h4>内蒙古 霍林河</h4>
							<p>位于帕劳群岛其中一座岩岛埃尔·马尔克，是在大约1.2万年前形成的，当时地壳隆起致使这座岛屿高出海平面，海水则被其中部下陷处捕获。 水母湖内生活着数百万只水母，它们是藻类的宿主，通过与藻类形成的共生关系生存。在大约每10年出现一次的厄尔尼诺现象影响下，水母湖温度升高，致使水母居民大面积死亡，但这些生命力顽强的动物经常能够实现数量大反弹。</p>
						</div>
						<div class="clearfix"> </div>
					</div>
					<div class="col-md-4 adv-left">
						<div class="a-left">
							<h4>5.</h4>
						</div>
						<div class="a-right">
							<h4>南半球 大溪地海滩</h4>
							<p>位于帕劳群岛其中一座岩岛埃尔·马尔克，是在大约1.2万年前形成的，当时地壳隆起致使这座岛屿高出海平面，海水则被其中部下陷处捕获。 水母湖内生活着数百万只水母，它们是藻类的宿主，通过与藻类形成的共生关系生存。在大约每10年出现一次的厄尔尼诺现象影响下，水母湖温度升高，致使水母居民大面积死亡，但这些生命力顽强的动物经常能够实现数量大反弹。</p>
						</div>
						<div class="clearfix"> </div>
					</div>
					<div class="col-md-4 adv-left">
						<div class="a-left">
							<h4>6.</h4>
						</div>
						<div class="a-right">
							<h4>马尔代夫</h4>
							<p>位于帕劳群岛其中一座岩岛埃尔·马尔克，是在大约1.2万年前形成的，当时地壳隆起致使这座岛屿高出海平面，海水则被其中部下陷处捕获。 水母湖内生活着数百万只水母，它们是藻类的宿主，通过与藻类形成的共生关系生存。在大约每10年出现一次的厄尔尼诺现象影响下，水母湖温度升高，致使水母居民大面积死亡，但这些生命力顽强的动物经常能够实现数量大反弹。</p>
						</div>
						<div class="clearfix"> </div>
					</div>
					<div class="clearfix"> </div>
				</div>
			</div>
		</div>
	</div>
	<!--end-advantage-->
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
						<input type="text"  value="Enter email" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Enter email';}">
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