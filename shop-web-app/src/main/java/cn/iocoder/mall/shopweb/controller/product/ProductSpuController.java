package cn.iocoder.mall.shopweb.controller.product;

import cn.iocoder.common.framework.vo.CommonResult;
import cn.iocoder.common.framework.vo.PageResult;
import cn.iocoder.mall.shopweb.controller.product.vo.product.ProductSpuPageReqVO;
import cn.iocoder.mall.shopweb.controller.product.vo.product.ProductSpuRespVO;
import cn.iocoder.mall.shopweb.manager.product.ProductSpuManager;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static cn.iocoder.common.framework.vo.CommonResult.success;

@Api(tags = "商品 SPU API")
@RestController
@RequestMapping("/product-spu")
@Validated
public class ProductSpuController {

    @Autowired
    private ProductSpuManager productSpuManager;

    @GetMapping("/page")
    @ApiOperation("获得商品 SPU 的分页")
    public CommonResult<PageResult<ProductSpuRespVO>> pageProductSpu(ProductSpuPageReqVO pageReqVO) {
        return success(productSpuManager.pageProductSpu(pageReqVO));
    }

}