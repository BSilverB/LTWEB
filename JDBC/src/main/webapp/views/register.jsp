<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Đăng ký tài khoản</title>
<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body class="bg-light">

	<div class="container">
		<div class="row justify-content-center">
			<div class="col-md-5">
				<div class="card mt-5 shadow">
					<div class="card-body">
						<h3 class="text-center mb-4">Tạo tài khoản mới</h3>

						<!-- Hiển thị alert nếu có -->
						<c:if test="${not empty alert}">
							<div class="alert alert-danger">${alert}</div>
						</c:if>

						<!-- Form đăng ký -->
						<form action="${pageContext.request.contextPath}/register"
							method="post">
							<div class="mb-3">
								<input type="text" name="username" class="form-control"
									placeholder="Tên đăng nhập" required>
							</div>
							<div class="mb-3">
								<input type="text" name="fullname" class="form-control"
									placeholder="Họ tên" required>
							</div>
							<div class="mb-3">
								<input type="email" name="email" class="form-control"
									placeholder="Nhập Email" required>
							</div>
							<div class="mb-3">
								<input type="text" name="phone" class="form-control"
									placeholder="Số điện thoại" required>
							</div>
							<div class="mb-3">
								<input type="password" name="password" class="form-control"
									placeholder="Mật khẩu" required>
							</div>
							<div class="mb-3">
								<input type="password" name="repassword" class="form-control"
									placeholder="Nhập lại mật khẩu" required>
							</div>

							<button type="submit" class="btn btn-primary w-100">Tạo
								tài khoản</button>
						</form>

						<div class="text-center mt-3">
							Nếu bạn đã có tài khoản? <a
								href="${pageContext.request.contextPath}/login">Đăng nhập</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Bootstrap JS -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
