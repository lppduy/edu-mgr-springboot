
# RESTful API Structure for Pet Project

## 1. Admin APIs

- **Đăng nhập (POST)**
  - **URL**: `/api/admin/login`
  - **Body**: `{ "username": "string", "password": "string" }`

- **Xóa user (DELETE - Soft Delete)**
  - **URL**: `/api/admin/users/{userId}`
  - **Response**: `204 No Content`

- **Cập nhật thông tin giáo viên (PUT)**
  - **URL**: `/api/admin/teachers/{teacherId}`
  - **Body**: `{ "name": "string", "status": "string", "details": "string" }`

- **Xóa giáo viên (DELETE - Soft Delete)**
  - **URL**: `/api/admin/teachers/{teacherId}`
  - **Response**: `204 No Content`

- **Thêm khóa học (POST)**
  - **URL**: `/api/admin/courses`
  - **Body**: `{ "name": "string", "description": "string", "teacherId": "string", "category": "string" }`

- **Cập nhật thông tin khóa học (PUT)**
  - **URL**: `/api/admin/courses/{courseId}`
  - **Body**: `{ "name": "string", "description": "string" }`

- **Xóa khóa học (DELETE - Soft Delete)**
  - **URL**: `/api/admin/courses/{courseId}`
  - **Response**: `204 No Content`

- **Thêm chapter cho khóa học (POST)**
  - **URL**: `/api/admin/courses/{courseId}/chapters`
  - **Body**: `{ "chapters": [{ "name": "string", "description": "string" }] }`

- **Cập nhật chapter (PUT)**
  - **URL**: `/api/admin/chapters/{chapterId}`
  - **Body**: `{ "name": "string", "description": "string" }`

- **Xóa chapter (DELETE - Soft Delete)**
  - **URL**: `/api/admin/chapters/{chapterId}`
  - **Response**: `204 No Content`

- **Thêm bài học cho chapter (POST)**
  - **URL**: `/api/admin/chapters/{chapterId}/lessons`
  - **Body**: `{ "lessons": [{ "name": "string", "type": "string" }] }`

- **Cập nhật bài học (PUT)**
  - **URL**: `/api/admin/lessons/{lessonId}`
  - **Body**: `{ "name": "string", "type": "string", "content": "string" }`

- **Xóa bài học (DELETE - Soft Delete)**
  - **URL**: `/api/admin/lessons/{lessonId}`
  - **Response**: `204 No Content`

- **Hiển thị danh sách entity với phân trang và sắp xếp (GET)**
  - **URL**: `/api/admin/{entity}`
  - **Params**: `?page=number&size=number&sort=field,asc|desc`

## 2. User APIs

- **Đăng ký (POST)**
  - **URL**: `/api/users`
  - **Body**: `{ "username": "string", "password": "string", "email": "string" }`

- **Đăng nhập (POST)**
  - **URL**: `/api/users/login`
  - **Body**: `{ "username": "string", "password": "string" }`

- **Cập nhật thông tin user (PUT)**
  - **URL**: `/api/users/{userId}`
  - **Body**: `{ "name": "string", "email": "string", "password": "string" }`

- **Xóa tài khoản (DELETE - Soft Delete)**
  - **URL**: `/api/users/{userId}`
  - **Response**: `204 No Content`

- **Đăng ký khóa học (POST)**
  - **URL**: `/api/users/{userId}/courses`
  - **Body**: `{ "courseId": "string" }`

- **Đánh giá khóa học (POST)**
  - **URL**: `/api/courses/{courseId}/ratings`
  - **Body**: `{ "rating": number, "comment": "string" }`

- **Xem chi tiết khóa học (GET)**
  - **URL**: `/api/courses/{courseId}`

- **Tìm kiếm khóa học đã đăng ký (GET)**
  - **URL**: `/api/users/{userId}/courses`
  - **Params**: `?searchParams=string&page=number&size=number&sort=field,asc|desc`

- **Bắt đầu bài học (POST)**
  - **URL**: `/api/lessons/{lessonId}/start`

- **Kết thúc bài học (POST)**
  - **URL**: `/api/lessons/{lessonId}/end`

## Common Structure

- **Pagination & Sorting**:
  - Params: `?page=number&size=number&sort=field,asc|desc`
  - Example: `/api/admin/courses?page=1&size=10&sort=name,asc`
