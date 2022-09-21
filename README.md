# Blogging-Application
Backend Web Development Project

# Curl For All the APIs
{
    "openapi": "3.0.3",
    "info": {
        "title": "Blogging Application : Backend",
        "description": " This project is developed by Swapnesh Sahu ",
        "contact": {
            "name": "Swapnesh Sahu",
            "email": "Swapneshsahu22@gmail.com"
        }
    },
    "servers": [
        {
            "url": "http://localhost:5000",
            "description": "Inferred Url"
        }
    ],
    "tags": [
        {
            "name": "basic-error-controller",
            "description": "Basic Error Controller"
        },
        {
            "name": "category-controller",
            "description": "Category Controller"
        },
        {
            "name": "comment-controller",
            "description": "Comment Controller"
        },
        {
            "name": "post-controller",
            "description": "Post Controller"
        },
        {
            "name": "user-controller",
            "description": "User Controller"
        }
    ],
    "paths": {
        "/error": {
            "get": {
                "tags": [
                    "basic-error-controller"
                ],
                "summary": "errorHtml",
                "operationId": "errorHtmlUsingGET",
                "responses": {
                    "200": {
                        "description": "OK",
                        "content": {
                            "text/html": {
                                "schema": {
                                    "$ref": "#/components/schemas/ModelAndView"
                                }
                            }
                        }
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            },
            "put": {
                "tags": [
                    "basic-error-controller"
                ],
                "summary": "errorHtml",
                "operationId": "errorHtmlUsingPUT",
                "responses": {
                    "200": {
                        "description": "OK",
                        "content": {
                            "text/html": {
                                "schema": {
                                    "$ref": "#/components/schemas/ModelAndView"
                                }
                            }
                        }
                    },
                    "201": {
                        "description": "Created"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            },
            "post": {
                "tags": [
                    "basic-error-controller"
                ],
                "summary": "errorHtml",
                "operationId": "errorHtmlUsingPOST",
                "responses": {
                    "200": {
                        "description": "OK",
                        "content": {
                            "text/html": {
                                "schema": {
                                    "$ref": "#/components/schemas/ModelAndView"
                                }
                            }
                        }
                    },
                    "201": {
                        "description": "Created"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            },
            "delete": {
                "tags": [
                    "basic-error-controller"
                ],
                "summary": "errorHtml",
                "operationId": "errorHtmlUsingDELETE",
                "responses": {
                    "200": {
                        "description": "OK",
                        "content": {
                            "text/html": {
                                "schema": {
                                    "$ref": "#/components/schemas/ModelAndView"
                                }
                            }
                        }
                    },
                    "204": {
                        "description": "No Content"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    }
                }
            },
            "options": {
                "tags": [
                    "basic-error-controller"
                ],
                "summary": "errorHtml",
                "operationId": "errorHtmlUsingOPTIONS",
                "responses": {
                    "200": {
                        "description": "OK",
                        "content": {
                            "text/html": {
                                "schema": {
                                    "$ref": "#/components/schemas/ModelAndView"
                                }
                            }
                        }
                    },
                    "204": {
                        "description": "No Content"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    }
                }
            },
            "head": {
                "tags": [
                    "basic-error-controller"
                ],
                "summary": "errorHtml",
                "operationId": "errorHtmlUsingHEAD",
                "responses": {
                    "200": {
                        "description": "OK",
                        "content": {
                            "text/html": {
                                "schema": {
                                    "$ref": "#/components/schemas/ModelAndView"
                                }
                            }
                        }
                    },
                    "204": {
                        "description": "No Content"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    }
                }
            },
            "patch": {
                "tags": [
                    "basic-error-controller"
                ],
                "summary": "errorHtml",
                "operationId": "errorHtmlUsingPATCH",
                "responses": {
                    "200": {
                        "description": "OK",
                        "content": {
                            "text/html": {
                                "schema": {
                                    "$ref": "#/components/schemas/ModelAndView"
                                }
                            }
                        }
                    },
                    "204": {
                        "description": "No Content"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    }
                }
            },
            "trace": {
                "tags": [
                    "basic-error-controller"
                ],
                "summary": "errorHtml",
                "operationId": "errorHtmlUsingTRACE",
                "responses": {
                    "200": {
                        "description": "OK",
                        "content": {
                            "text/html": {
                                "schema": {
                                    "$ref": "#/components/schemas/ModelAndView"
                                }
                            }
                        }
                    },
                    "204": {
                        "description": "No Content"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    }
                }
            }
        },
        "/api/category/allCategory": {
            "get": {
                "tags": [
                    "category-controller"
                ],
                "summary": "getAllCategory",
                "operationId": "getAllCategoryUsingGET",
                "responses": {
                    "200": {
                        "description": "OK",
                        "content": {
                            "*/*": {
                                "schema": {
                                    "type": "array",
                                    "items": {
                                        "$ref": "#/components/schemas/CategoryDto"
                                    }
                                }
                            }
                        }
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/api/category/byId/{id}": {
            "get": {
                "tags": [
                    "category-controller"
                ],
                "summary": "getCategoryByID",
                "operationId": "getCategoryByIDUsingGET",
                "parameters": [
                    {
                        "name": "id",
                        "in": "path",
                        "description": "id",
                        "required": true,
                        "style": "simple",
                        "schema": {
                            "type": "integer",
                            "format": "int32"
                        }
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "content": {
                            "*/*": {
                                "schema": {
                                    "$ref": "#/components/schemas/CategoryDto"
                                }
                            }
                        }
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/api/category/create": {
            "post": {
                "tags": [
                    "category-controller"
                ],
                "summary": "createCategory",
                "operationId": "createCategoryUsingPOST",
                "requestBody": {
                    "content": {
                        "application/json": {
                            "schema": {
                                "$ref": "#/components/schemas/CategoryDto"
                            }
                        }
                    }
                },
                "responses": {
                    "200": {
                        "description": "OK",
                        "content": {
                            "*/*": {
                                "schema": {
                                    "$ref": "#/components/schemas/CategoryDto"
                                }
                            }
                        }
                    },
                    "201": {
                        "description": "Created"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/api/category/delete/{id}": {
            "delete": {
                "tags": [
                    "category-controller"
                ],
                "summary": "deleteCategory",
                "operationId": "deleteCategoryUsingDELETE",
                "parameters": [
                    {
                        "name": "id",
                        "in": "path",
                        "description": "id",
                        "required": true,
                        "style": "simple",
                        "schema": {
                            "type": "integer",
                            "format": "int32"
                        }
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "content": {
                            "*/*": {
                                "schema": {
                                    "type": "object"
                                }
                            }
                        }
                    },
                    "204": {
                        "description": "No Content"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    }
                }
            }
        },
        "/api/category/update/{id}": {
            "put": {
                "tags": [
                    "category-controller"
                ],
                "summary": "updateCategory",
                "operationId": "updateCategoryUsingPUT",
                "parameters": [
                    {
                        "name": "id",
                        "in": "path",
                        "description": "id",
                        "required": true,
                        "style": "simple",
                        "schema": {
                            "type": "integer",
                            "format": "int32"
                        }
                    }
                ],
                "requestBody": {
                    "content": {
                        "application/json": {
                            "schema": {
                                "$ref": "#/components/schemas/CategoryDto"
                            }
                        }
                    }
                },
                "responses": {
                    "200": {
                        "description": "OK",
                        "content": {
                            "*/*": {
                                "schema": {
                                    "$ref": "#/components/schemas/CategoryDto"
                                }
                            }
                        }
                    },
                    "201": {
                        "description": "Created"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/api/comment/delete/{commentId}": {
            "delete": {
                "tags": [
                    "comment-controller"
                ],
                "summary": "deleteComment",
                "operationId": "deleteCommentUsingDELETE",
                "parameters": [
                    {
                        "name": "commentId",
                        "in": "path",
                        "description": "commentId",
                        "required": true,
                        "style": "simple",
                        "schema": {
                            "type": "integer",
                            "format": "int32"
                        }
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "content": {
                            "*/*": {
                                "schema": {
                                    "type": "object"
                                }
                            }
                        }
                    },
                    "204": {
                        "description": "No Content"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    }
                }
            }
        },
        "/api/comment/post/{postID}": {
            "post": {
                "tags": [
                    "comment-controller"
                ],
                "summary": "createComment",
                "operationId": "createCommentUsingPOST",
                "parameters": [
                    {
                        "name": "postID",
                        "in": "path",
                        "description": "postID",
                        "required": true,
                        "style": "simple",
                        "schema": {
                            "type": "integer",
                            "format": "int32"
                        }
                    }
                ],
                "requestBody": {
                    "content": {
                        "application/json": {
                            "schema": {
                                "$ref": "#/components/schemas/CommentDto"
                            }
                        }
                    }
                },
                "responses": {
                    "200": {
                        "description": "OK",
                        "content": {
                            "*/*": {
                                "schema": {
                                    "$ref": "#/components/schemas/CommentDto"
                                }
                            }
                        }
                    },
                    "201": {
                        "description": "Created"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/api/post/allPost": {
            "get": {
                "tags": [
                    "post-controller"
                ],
                "summary": "findAllPost",
                "operationId": "findAllPostUsingGET",
                "parameters": [
                    {
                        "name": "page_number",
                        "in": "query",
                        "description": "page_number",
                        "required": false,
                        "style": "form",
                        "schema": {
                            "type": "integer",
                            "format": "int32"
                        }
                    },
                    {
                        "name": "page_size",
                        "in": "query",
                        "description": "page_size",
                        "required": false,
                        "style": "form",
                        "schema": {
                            "type": "integer",
                            "format": "int32"
                        }
                    },
                    {
                        "name": "sortBy",
                        "in": "query",
                        "description": "sortBy",
                        "required": false,
                        "style": "form",
                        "schema": {
                            "type": "string"
                        }
                    },
                    {
                        "name": "sortDir",
                        "in": "query",
                        "description": "sortDir",
                        "required": false,
                        "style": "form",
                        "schema": {
                            "type": "string"
                        }
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "content": {
                            "*/*": {
                                "schema": {
                                    "$ref": "#/components/schemas/PostResponse"
                                }
                            }
                        }
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/api/post/byId/{id}": {
            "delete": {
                "tags": [
                    "post-controller"
                ],
                "summary": "deletePost",
                "operationId": "deletePostUsingDELETE",
                "parameters": [
                    {
                        "name": "id",
                        "in": "path",
                        "description": "id",
                        "required": true,
                        "style": "simple",
                        "schema": {
                            "type": "integer",
                            "format": "int32"
                        }
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "content": {
                            "*/*": {
                                "schema": {
                                    "type": "object"
                                }
                            }
                        }
                    },
                    "204": {
                        "description": "No Content"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    }
                }
            }
        },
        "/api/post/categoryId/{categoryID}": {
            "get": {
                "tags": [
                    "post-controller"
                ],
                "summary": "findPostByCategory",
                "operationId": "findPostByCategoryUsingGET",
                "parameters": [
                    {
                        "name": "categoryID",
                        "in": "path",
                        "description": "categoryID",
                        "required": true,
                        "style": "simple",
                        "schema": {
                            "type": "integer",
                            "format": "int32"
                        }
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "content": {
                            "*/*": {
                                "schema": {
                                    "type": "array",
                                    "items": {
                                        "$ref": "#/components/schemas/PostDto"
                                    }
                                }
                            }
                        }
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/api/post/postId/{postID}": {
            "get": {
                "tags": [
                    "post-controller"
                ],
                "summary": "findPostByID",
                "operationId": "findPostByIDUsingGET",
                "parameters": [
                    {
                        "name": "postID",
                        "in": "path",
                        "description": "postID",
                        "required": true,
                        "style": "simple",
                        "schema": {
                            "type": "integer",
                            "format": "int32"
                        }
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "content": {
                            "*/*": {
                                "schema": {
                                    "$ref": "#/components/schemas/PostDto"
                                }
                            }
                        }
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/api/post/search/{keywords}": {
            "get": {
                "tags": [
                    "post-controller"
                ],
                "summary": "findPostByID",
                "operationId": "findPostByIDUsingGET_1",
                "parameters": [
                    {
                        "name": "keywords",
                        "in": "path",
                        "description": "keywords",
                        "required": true,
                        "style": "simple",
                        "schema": {
                            "type": "string"
                        }
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "content": {
                            "*/*": {
                                "schema": {
                                    "type": "array",
                                    "items": {
                                        "$ref": "#/components/schemas/PostDto"
                                    }
                                }
                            }
                        }
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/api/post/update/{postID}": {
            "put": {
                "tags": [
                    "post-controller"
                ],
                "summary": "updatePost",
                "operationId": "updatePostUsingPUT",
                "parameters": [
                    {
                        "name": "postID",
                        "in": "path",
                        "description": "postID",
                        "required": true,
                        "style": "simple",
                        "schema": {
                            "type": "integer",
                            "format": "int32"
                        }
                    }
                ],
                "requestBody": {
                    "content": {
                        "application/json": {
                            "schema": {
                                "$ref": "#/components/schemas/PostDto"
                            }
                        }
                    }
                },
                "responses": {
                    "200": {
                        "description": "OK",
                        "content": {
                            "*/*": {
                                "schema": {
                                    "$ref": "#/components/schemas/PostDto"
                                }
                            }
                        }
                    },
                    "201": {
                        "description": "Created"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/api/post/user/{userID}/category/{categoryID}": {
            "post": {
                "tags": [
                    "post-controller"
                ],
                "summary": "createPost",
                "operationId": "createPostUsingPOST",
                "parameters": [
                    {
                        "name": "userID",
                        "in": "path",
                        "description": "userID",
                        "required": true,
                        "style": "simple",
                        "schema": {
                            "type": "integer",
                            "format": "int32"
                        }
                    },
                    {
                        "name": "categoryID",
                        "in": "path",
                        "description": "categoryID",
                        "required": true,
                        "style": "simple",
                        "schema": {
                            "type": "integer",
                            "format": "int32"
                        }
                    }
                ],
                "requestBody": {
                    "content": {
                        "application/json": {
                            "schema": {
                                "$ref": "#/components/schemas/PostDto"
                            }
                        }
                    }
                },
                "responses": {
                    "200": {
                        "description": "OK",
                        "content": {
                            "*/*": {
                                "schema": {
                                    "$ref": "#/components/schemas/PostDto"
                                }
                            }
                        }
                    },
                    "201": {
                        "description": "Created"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/api/post/userId/{userID}": {
            "get": {
                "tags": [
                    "post-controller"
                ],
                "summary": "findPostByUser",
                "operationId": "findPostByUserUsingGET",
                "parameters": [
                    {
                        "name": "userID",
                        "in": "path",
                        "description": "userID",
                        "required": true,
                        "style": "simple",
                        "schema": {
                            "type": "integer",
                            "format": "int32"
                        }
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "content": {
                            "*/*": {
                                "schema": {
                                    "type": "array",
                                    "items": {
                                        "$ref": "#/components/schemas/PostDto"
                                    }
                                }
                            }
                        }
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/api/users/alluser": {
            "get": {
                "tags": [
                    "user-controller"
                ],
                "summary": "getAllUser",
                "operationId": "getAllUserUsingGET",
                "responses": {
                    "200": {
                        "description": "OK",
                        "content": {
                            "*/*": {
                                "schema": {
                                    "type": "array",
                                    "items": {
                                        "$ref": "#/components/schemas/UserDto"
                                    }
                                }
                            }
                        }
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/api/users/create": {
            "post": {
                "tags": [
                    "user-controller"
                ],
                "summary": "createUser",
                "operationId": "createUserUsingPOST",
                "requestBody": {
                    "content": {
                        "application/json": {
                            "schema": {
                                "$ref": "#/components/schemas/UserDto"
                            }
                        }
                    }
                },
                "responses": {
                    "200": {
                        "description": "OK",
                        "content": {
                            "*/*": {
                                "schema": {
                                    "$ref": "#/components/schemas/UserDto"
                                }
                            }
                        }
                    },
                    "201": {
                        "description": "Created"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/api/users/delete/{id}": {
            "delete": {
                "tags": [
                    "user-controller"
                ],
                "summary": "deleteUser",
                "operationId": "deleteUserUsingDELETE",
                "parameters": [
                    {
                        "name": "id",
                        "in": "path",
                        "description": "id",
                        "required": true,
                        "style": "simple",
                        "schema": {
                            "type": "integer",
                            "format": "int32"
                        }
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "content": {
                            "*/*": {
                                "schema": {
                                    "type": "object"
                                }
                            }
                        }
                    },
                    "204": {
                        "description": "No Content"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    }
                }
            }
        },
        "/api/users/update/{id}": {
            "put": {
                "tags": [
                    "user-controller"
                ],
                "summary": "updateUser",
                "operationId": "updateUserUsingPUT",
                "parameters": [
                    {
                        "name": "id",
                        "in": "path",
                        "description": "id",
                        "required": true,
                        "style": "simple",
                        "schema": {
                            "type": "integer",
                            "format": "int32"
                        }
                    }
                ],
                "requestBody": {
                    "content": {
                        "application/json": {
                            "schema": {
                                "$ref": "#/components/schemas/UserDto"
                            }
                        }
                    }
                },
                "responses": {
                    "200": {
                        "description": "OK",
                        "content": {
                            "*/*": {
                                "schema": {
                                    "$ref": "#/components/schemas/UserDto"
                                }
                            }
                        }
                    },
                    "201": {
                        "description": "Created"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/api/users/{id}": {
            "get": {
                "tags": [
                    "user-controller"
                ],
                "summary": "getUserByID",
                "operationId": "getUserByIDUsingGET",
                "parameters": [
                    {
                        "name": "id",
                        "in": "path",
                        "description": "id",
                        "required": true,
                        "style": "simple",
                        "schema": {
                            "type": "integer",
                            "format": "int32"
                        }
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "content": {
                            "*/*": {
                                "schema": {
                                    "$ref": "#/components/schemas/UserDto"
                                }
                            }
                        }
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        }
    },
    "components": {
        "schemas": {
            "CategoryDto": {
                "title": "CategoryDto",
                "type": "object",
                "properties": {
                    "categoryDiscription": {
                        "type": "string"
                    },
                    "categoryTitle": {
                        "type": "string"
                    },
                    "categoryid": {
                        "type": "integer",
                        "format": "int32"
                    }
                }
            },
            "CommentDto": {
                "title": "CommentDto",
                "type": "object",
                "properties": {
                    "commentId": {
                        "type": "integer",
                        "format": "int32"
                    },
                    "content": {
                        "type": "string"
                    }
                }
            },
            "ModelAndView": {
                "title": "ModelAndView",
                "type": "object",
                "properties": {
                    "empty": {
                        "type": "boolean"
                    },
                    "model": {
                        "type": "object"
                    },
                    "modelMap": {
                        "type": "object",
                        "additionalProperties": {
                            "type": "object"
                        }
                    },
                    "reference": {
                        "type": "boolean"
                    },
                    "status": {
                        "type": "string",
                        "enum": [
                            "ACCEPTED",
                            "ALREADY_REPORTED",
                            "BAD_GATEWAY",
                            "BAD_REQUEST",
                            "BANDWIDTH_LIMIT_EXCEEDED",
                            "CHECKPOINT",
                            "CONFLICT",
                            "CONTINUE",
                            "CREATED",
                            "DESTINATION_LOCKED",
                            "EXPECTATION_FAILED",
                            "FAILED_DEPENDENCY",
                            "FORBIDDEN",
                            "FOUND",
                            "GATEWAY_TIMEOUT",
                            "GONE",
                            "HTTP_VERSION_NOT_SUPPORTED",
                            "IM_USED",
                            "INSUFFICIENT_SPACE_ON_RESOURCE",
                            "INSUFFICIENT_STORAGE",
                            "INTERNAL_SERVER_ERROR",
                            "I_AM_A_TEAPOT",
                            "LENGTH_REQUIRED",
                            "LOCKED",
                            "LOOP_DETECTED",
                            "METHOD_FAILURE",
                            "METHOD_NOT_ALLOWED",
                            "MOVED_PERMANENTLY",
                            "MOVED_TEMPORARILY",
                            "MULTIPLE_CHOICES",
                            "MULTI_STATUS",
                            "NETWORK_AUTHENTICATION_REQUIRED",
                            "NON_AUTHORITATIVE_INFORMATION",
                            "NOT_ACCEPTABLE",
                            "NOT_EXTENDED",
                            "NOT_FOUND",
                            "NOT_IMPLEMENTED",
                            "NOT_MODIFIED",
                            "NO_CONTENT",
                            "OK",
                            "PARTIAL_CONTENT",
                            "PAYLOAD_TOO_LARGE",
                            "PAYMENT_REQUIRED",
                            "PERMANENT_REDIRECT",
                            "PRECONDITION_FAILED",
                            "PRECONDITION_REQUIRED",
                            "PROCESSING",
                            "PROXY_AUTHENTICATION_REQUIRED",
                            "REQUESTED_RANGE_NOT_SATISFIABLE",
                            "REQUEST_ENTITY_TOO_LARGE",
                            "REQUEST_HEADER_FIELDS_TOO_LARGE",
                            "REQUEST_TIMEOUT",
                            "REQUEST_URI_TOO_LONG",
                            "RESET_CONTENT",
                            "SEE_OTHER",
                            "SERVICE_UNAVAILABLE",
                            "SWITCHING_PROTOCOLS",
                            "TEMPORARY_REDIRECT",
                            "TOO_EARLY",
                            "TOO_MANY_REQUESTS",
                            "UNAUTHORIZED",
                            "UNAVAILABLE_FOR_LEGAL_REASONS",
                            "UNPROCESSABLE_ENTITY",
                            "UNSUPPORTED_MEDIA_TYPE",
                            "UPGRADE_REQUIRED",
                            "URI_TOO_LONG",
                            "USE_PROXY",
                            "VARIANT_ALSO_NEGOTIATES"
                        ]
                    },
                    "view": {
                        "$ref": "#/components/schemas/View"
                    },
                    "viewName": {
                        "type": "string"
                    }
                }
            },
            "PostDto": {
                "title": "PostDto",
                "type": "object",
                "properties": {
                    "addedDate": {
                        "type": "string",
                        "format": "date-time"
                    },
                    "category": {
                        "$ref": "#/components/schemas/CategoryDto"
                    },
                    "comments": {
                        "uniqueItems": true,
                        "type": "array",
                        "items": {
                            "$ref": "#/components/schemas/CommentDto"
                        }
                    },
                    "content": {
                        "type": "string"
                    },
                    "postid": {
                        "type": "integer",
                        "format": "int32"
                    },
                    "title": {
                        "type": "string"
                    },
                    "user": {
                        "$ref": "#/components/schemas/UserDto"
                    }
                }
            },
            "PostResponse": {
                "title": "PostResponse",
                "type": "object",
                "properties": {
                    "content": {
                        "type": "array",
                        "items": {
                            "$ref": "#/components/schemas/PostDto"
                        }
                    },
                    "lastPage": {
                        "type": "boolean"
                    },
                    "pageNumber": {
                        "type": "integer",
                        "format": "int32"
                    },
                    "pageSize": {
                        "type": "integer",
                        "format": "int32"
                    },
                    "totalElement": {
                        "type": "integer",
                        "format": "int64"
                    },
                    "totalPages": {
                        "type": "integer",
                        "format": "int64"
                    }
                }
            },
            "UserDto": {
                "title": "UserDto",
                "type": "object",
                "properties": {
                    "about": {
                        "type": "string"
                    },
                    "email": {
                        "type": "string"
                    },
                    "id": {
                        "type": "integer",
                        "format": "int32"
                    },
                    "name": {
                        "maxLength": 2147483647,
                        "minLength": 4,
                        "type": "string"
                    },
                    "password": {
                        "type": "string"
                    }
                }
            },
            "View": {
                "title": "View",
                "type": "object",
                "properties": {
                    "contentType": {
                        "type": "string"
                    }
                }
            }
        }
    }
}
