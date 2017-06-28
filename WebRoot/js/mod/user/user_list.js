/**
 * 
 */

$(function(){
    var fnQueryUserList = function(pageNo, pageSize) {
        pageSize = pageSize || 10;
        $.getJSON(contextPath + "/user/list/" + pageNo + "/" + pageSize, function(data) {
            console.log(data);
            if(data['code'] < 0) {
                alert(data['note']);
                return;
            }
            var html = '';
            for(var i = 0, len = data['records'].length; i < len; i++) {
                html += '<tr>'
                    + '<td>' + data['records'][i]['userId'] + '</td>'
                    + '<td>' + data['records'][i]['userName'] + '</td>'
                    + '<td>' + data['records'][i]['remark'] + '</td>'
                    + '<td>' + '' + '</td>'
                    + '</tr>';
            }
            $("#user_list_tbody").html(html);

            var maxPageNo = Math.ceil(data['totalcount'] / pageSize);
            html = '<li' + (pageNo == 1 ? ' class="disabled"' : '')
                + '><a href="javascript:;" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a></li>';
            for(var i = 1; i <= maxPageNo; i++) {
                html += '<li' + (i == pageNo ? ' class="active"' : '') + '>'
                    + '<a href="javascript:;" >' + i + '</a>'
                    + '</li>';
            }
            html += '<li' + (pageNo == maxPageNo ? ' class="disabled"' : '')
                + '><a href="javascript:;" aria-label="Next"><span aria-hidden="true">&raquo;</span></a></li>';
            $("#user_list_pagination").html(html)
                .data("pageNo", pageNo)
                .data("maxPageNo", maxPageNo);
        });
    };
    fnQueryUserList(1);

    $("#user_list_pagination").delegate("a", "click", function() {
        var pageNo = $(this).text();
        if(isNaN(pageNo)) {
            if ("«" == pageNo) {
                pageNo = $("#user_list_pagination").data("pageNo") - 1;
            } else if ("»" == pageNo) {
                pageNo = $("#user_list_pagination").data("pageNo") + 1;
            }
        } else {
            pageNo = Number(pageNo);
        }
        if( 0 < pageNo && pageNo <= $("#user_list_pagination").data("maxPageNo")) {
            fnQueryUserList(pageNo);
        }
    });
});