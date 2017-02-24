# springboot-security-oauth2
### Spring集成Spring Security、OAuth2实现资源访问授权认证。
### 后端主要做的是认证服务器和资源服务。
### 用户登录使用自定义UserDetailService从MySQL中加载数据。
### 用户认证的token使用RedisTokenStore保存在redis中。