<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div class="templatemo-top-nav-container">
	<div class="row">
		<nav class="templatemo-top-nav col-lg-12 col-md-12">
			<ul class="text-uppercase">
				<li><a href="/" class="active">Trang Chủ</a></li>
				<li><a href="">Dashboard</a></li>
				<li><a href="">Overview</a></li>
				<li><a href="login.html">Sign in form</a></li>
				<div style="position: absolute; top: 0; right: 90; transform: translate(50%, 0);">
					<div style="text-align: center;">
						<div
							style="display: inline-block; position: relative; text-align: left;">
							<div
								style="width: 100px; height: 50px; overflow: hidden; margin: 0 auto;">
								<img style="width: 70%; height: 70%;"
									src="/imageNhanVien/${sessionScope.anh}" alt="">
							</div>
							<div style="text-align: center;margin: 0">
								<a href="#">${sessionScope.tenNv}</a><br> <span>${sessionScope.chucVu}</span>
							</div>
						</div>
					</div>
			</ul>
		</nav>
	</div>
</div>