<div class="container">
    <div class="row">
        <div class="col-md-4 col-md-offset-4">
            <form method="post" action="/login" class="login">
                <div class="titleH">Login</div>
                <div class="error">${errorMsg}</div>
                <div class="form-group">
                    <label for="username">Username</label>
                    <input type="text" name="email" id="username" required="required" class="form-control"/>
                </div>
                <div class="form-group">
                    <label for="password">Password</label>
                    <input type="password" name="password" id="password" required="required" class="form-control"/>
                </div>
                <div class="checkbox">
                    <label for="remember"><input type="checkbox" name="remember" id="remember"/>Remember me</label>
                </div>
                <button class="btn btn-primary pull-right" type="submit">Login</button>
                <div class="clearfix">
                    <hr/>
                    New To Coffee Shop? <a href="/signup">Sign Up</a> Now
                </div>
            </form>

        </div>
    </div>
</div>
